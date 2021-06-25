package com.string;

public class PrintFrequencies {

	public static void main(String[] args) {
		String str = "aabbccdd";
		printFrequency(str);

	}

	private static void printFrequency(String str) {

		int[] temp = new int[26];
		for (char val : str.toCharArray()) {
			temp[val - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if(temp[i] > 0) {
				System.out.println((char) (i + 'a') + " " + temp[i]);
			}
			
		}

	}

}

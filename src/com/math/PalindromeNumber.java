package com.math;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 126321;
		boolean res = palindrome(num);
		System.out.println(res == true ? "Palindrome" : "Not a Palindrome");
	}

	private static boolean palindrome(int num) {

		int res = 0, temp2 = num;

		while (num > 0) {
			int temp = num % 10;
			res = res * 10 + temp;
			num /= 10;
		}

		return res == temp2;
	}
}

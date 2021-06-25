package com.string;

public class Palindrome {

	public static void main(String[] args) {
		String str = "abbcbba";
		boolean palindrome = naiveIsPalindrome(str);
		System.out.println("Naive : " + palindrome);

	}

	private static boolean naiveIsPalindrome(String str) {
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		return str.equals(builder.toString());
	}

}

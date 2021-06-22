package com.math;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		int num = 251;

		int res = naiveTrailingZerosInFactorialOf(num);
		System.out.println("Trailing Zeros from Naive method: " + res);

		res = effTrailingZerosInFactorialOf(num);
		System.out.println("Eff Zeros from Naive method: " + res);

	}

	private static int effTrailingZerosInFactorialOf(int num) {

		int res = 0;

		for (int i = 5; i <= num; i *= 5) {
			res += num / i;
		}

		return res;
	}

	private static int naiveTrailingZerosInFactorialOf(int num) {

		int fact = 1;

		for (int i = 2; i <= num; i++) {
			fact *= i;
		}

		int res = 0;

		while (fact % 10 == 0) {
			res++;
			fact /= 10;
		}

		return res;
	}

}

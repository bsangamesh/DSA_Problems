package com.math;

public class Factorial {

	public static void main(String[] args) {
		int num = 4;

		int res = iterativeFactorial(num);
		System.out.println("result from iterative fact : " + res);
		res = recursiveFactorial(num);
		System.out.println("result from recu fact : " + res);

	}

	private static int recursiveFactorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * recursiveFactorial(num - 1);
	}

	private static int iterativeFactorial(int num) {
		int res = 1;

		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}

}

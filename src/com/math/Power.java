package com.math;

public class Power {

	public static void main(String[] args) {
		int x = 2, n = 2;
		int res = naivePowerOf(x, n);
		System.out.println("Naive : " + res);

		res = effPowerOf(x, n);
		System.out.println("Eff : " + res);

	}

	private static int effPowerOf(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int temp = effPowerOf(x, n / 2);
		temp *= temp;
		if (n % 2 == 0) {
			return temp;
		} else {
			return temp * x;
		}

	}

	private static int naivePowerOf(int x, int n) {
		int res = 1;

		for (int i = 0; i < n; i++) {
			res *= x;
		}
		return res;
	}

}

package com.math;

public class GCD {

	public static void main(String[] args) {
		int a = 12, b = 200;

		int gcd = naiveGcdOf(a, b);
		System.out.println("Naive : " + gcd);

		gcd = effEuclideanMethodGcdOf(a, b);
		System.out.println("Euclidean : " + gcd);

		gcd = effOptimisedEuclideanMethodGcdOf(a, b);
		System.out.println("Optimised Euclidean : " + gcd);

	}

	private static int effOptimisedEuclideanMethodGcdOf(int a, int b) {

		if (b == 0) {
			return a;
		}

		return effOptimisedEuclideanMethodGcdOf(b, a % b);
	}

	private static int effEuclideanMethodGcdOf(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	private static int naiveGcdOf(int a, int b) {

		int res = Math.min(a, b);

		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}

			res--;
		}
		return res;
	}

}

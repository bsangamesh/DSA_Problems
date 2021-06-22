package com.math;

public class LCM {

	public static void main(String[] args) {
		int a = 4, b = 6;

		int lcm = naiveLcmOf(a, b);
		System.out.println("Naive : " + lcm);

		lcm = effLcmOf(a, b);
		System.out.println("Eff : " + lcm);

	}

	private static int effLcmOf(int a, int b) {

		int gcd = gcdOf(a, b);

		return (a * b) / gcd;
	}

	private static int gcdOf(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcdOf(b, a % b);
	}

	private static int naiveLcmOf(int a, int b) {

		int res = Math.max(a, b);

		while (true) {
			if (res % a == 0 && res % b == 0) {
				break;
			}

			res++;
		}

		return res;
	}

}

package com.math;

public class PrimeFactors {

	public static void main(String[] args) {
		int n = 450;
		System.out.println("Naive");
		naivePrimeFactors(n);
		System.out.println();
		System.out.println("Eff");
		effPrimeFactors(n);
		System.out.println();
		System.out.println("More Eff");
		moreEffPrimeFactors(n);

	}

	private static void moreEffPrimeFactors(int n) {
		if (n <= 1) {
			return;
		}

		while (n % 2 == 0) {
			System.out.print(2+ " ");
			n /= 2;
		}

		while (n % 3 == 0) {
			System.out.print(3+ " ");
			n /= 3;
		}

		for (int i = 5; i * i <= n; i += 6) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}

			while (n % (i + 2) == 0) {
				System.out.print((i + 2)+ " ");
				n /= (i + 2);
			}
		}

		if (n > 3) {
			System.out.print(n);
		}

	}

	private static void effPrimeFactors(int n) {
		if (n <= 1) {
			return;
		}

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		if (n > 1) {
			System.out.print(n);
		}

	}

	private static void naivePrimeFactors(int n) {

		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.print(i + " ");
					x = x * i;
				}
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		if (n == 2 || n == 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || (n % (i + 2)) == 0) {
				return false;
			}
		}

		return true;
	}

}

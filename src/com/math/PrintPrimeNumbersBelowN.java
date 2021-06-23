package com.math;

import java.util.Arrays;

public class PrintPrimeNumbersBelowN {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Naive");
		naivePrintPrimeNumbersBelow(n);
		System.out.println();
		System.out.println("Sieve Of Eratosthenes");
		sieveOfEratosthenes(n);
		System.out.println();
		System.out.println("Optimised Sieve Of Eratosthenes");
		optimisedSieveOfEratosthenes(n);

	}

	private static void optimisedSieveOfEratosthenes(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
				for (int k = i * i; k <= n; k += i) {
					isPrime[k] = false;
				}
			}
		}

	}

	private static void sieveOfEratosthenes(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int k = i * 2; k <= n; k += i) {
					isPrime[k] = false;
				}
			}
		}

		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}

	}

	private static void naivePrintPrimeNumbersBelow(int n) {
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
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

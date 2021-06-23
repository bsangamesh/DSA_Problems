package com.math;

public class AllDivisorsOfANumber {

	public static void main(String[] args) {
		int n = 6;
		System.out.println("Naive");
		naivePrintAllDivisorsOf(n);
		System.out.println();
		System.out.println("Eff Not Sorted");
		effPrintAllDivisorsOfNotSorted(n);
		System.out.println();
		System.out.println("Eff Sorted");
		effPrintAllDivisorsOfInSorted(n);

	}

	private static void effPrintAllDivisorsOfInSorted(int n) {
		int i = 1;
		for (i = 1; i * i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		i--;
		for (; i >= 1; i--) {
			if (n % i == 0) {
				System.out.print(n / i + " ");
			}
		}

	}

	private static void effPrintAllDivisorsOfNotSorted(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				if (i != (n / i)) {
					System.out.print((n / i) + " ");
				}
			}
		}
	}

	private static void naivePrintAllDivisorsOf(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}

		}

	}

}

package com.math;

public class CheckForPrime {

	public static void main(String[] args) {
		int num = 121;

		boolean res = naiveIsPrime(num);
		System.out.println("Naive : " + res);

		res = effIsPrime(num);
		System.out.println("Eff : " + res);

		res = moreEffIsPrime(num);
		System.out.println("More Eff : " + res);

	}

	private static boolean moreEffIsPrime(int num) {
		if (num == 1) {
			return false;
		}

		if (num == 2 || num == 3) {
			return true;
		}

		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if(num % i == 0 ||  num % (i + 2) == 0){
				return false;
			}
		}

		return true;
	}

	private static boolean effIsPrime(int num) {

		if (num == 1) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static boolean naiveIsPrime(int num) {
		if (num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false ;
			}
		}

		return true;
	}

}

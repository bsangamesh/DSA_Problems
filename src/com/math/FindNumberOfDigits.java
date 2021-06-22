package com.math;

public class FindNumberOfDigits {

	public static void main(String[] args) {
		
		int num = 1334563643;
		numberOfDigits(num);
	}

	private static void numberOfDigits(int num) {
		int res = 0;
		
		while(num > 0) {
			res++;
			num /= 10;			
		}
		System.out.println(res);
	}
	
	

}

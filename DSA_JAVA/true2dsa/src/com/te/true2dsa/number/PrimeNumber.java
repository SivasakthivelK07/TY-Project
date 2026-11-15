package com.te.true2dsa.number;

public class PrimeNumber {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;
		primeNumbersInRange(start, end);
	}

	private static void primeNumbersInRange(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean checkPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

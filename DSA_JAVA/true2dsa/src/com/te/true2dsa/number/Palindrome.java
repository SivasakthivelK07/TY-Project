package com.te.true2dsa.number;

public class Palindrome {

	public static void main(String[] args) {
		int n = 515;
		boolean res = checkPalindrome(n);
		System.out.println(res);
	}

	private static boolean checkPalindrome(int n) {
		return n == reverse(n);
	}

	private static int reverse(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = (sum * 10) + rem;
			n /= 10;
		}
		return sum;

	}

}

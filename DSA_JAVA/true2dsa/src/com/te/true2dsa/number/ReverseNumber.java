package com.te.true2dsa.number;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 1545;
		int rev = reverse(n);
		System.out.println(rev);
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

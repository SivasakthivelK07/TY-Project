package com.te.true2dsa.number;

public class Armstrong {
	public static void main(String[] args) {
		int n = 9474;
		boolean isArmstrong = checkArmstrong(n);
		System.out.println(isArmstrong);
	}

	private static boolean checkArmstrong(int n) {
		int length = (n + "").length();
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += power(rem, length);
			n /= 10;
		}
		return temp == sum;
	}

	private static int power(int rem, int length) {
		return (int) Math.pow(rem, length);
	}
}

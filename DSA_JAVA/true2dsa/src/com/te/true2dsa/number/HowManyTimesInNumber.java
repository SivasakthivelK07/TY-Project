package com.te.true2dsa.number;

public class HowManyTimesInNumber {

	public static void main(String[] args) {
		int n = 888378846;
		int countWhat = 8;
		int count = howManyTimes(n, countWhat);
		System.out.println(count);
	}

	private static int howManyTimes(int n, int countWhat) {
		int count = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == countWhat) {
				count++;
			}
			n /= 10;
		}
		return count;
	}

}

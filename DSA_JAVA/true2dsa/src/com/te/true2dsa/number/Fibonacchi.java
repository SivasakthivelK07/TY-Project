package com.te.true2dsa.number;

public class Fibonacchi {
	public static void main(String[] args) {
		int n = 10;
		fibonacchiSeriesForN(n);
	}

	private static void fibonacchiSeriesForN(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}

package com.te.true2dsa.number;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int res=factorialOfN(n);
		System.out.println(res);
	}

	private static int factorialOfN(int n) {
		if(n<=0) {
			return 1;
		}
		return n*factorialOfN(n-1);
	}

}

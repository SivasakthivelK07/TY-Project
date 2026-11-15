package com.te.true2java.generic;

public class NumberClass {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		Number n = a + b;
		System.out.println(n.getClass().getSimpleName());

		Byte a1 = 10;
		Byte b1 = 20;
		Integer c1 = a1 + b1;
		System.out.println(c1);
		System.out.println(c1 instanceof Integer);
	}

}

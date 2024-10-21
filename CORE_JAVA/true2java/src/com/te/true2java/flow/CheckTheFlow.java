package com.te.true2java.flow;

class B {
	int a = 10; // Non static single line initializer
	static int b = 20; // Non static single line initializer
	{
		System.out.println("Non static multi line initializer");
	}
	static {
		System.out.println("Static multi line initializer");
	}

	B() {
		System.out.println("Constructor of the class B");
	}

	public static void m1() {
		System.out.println("M1() method of the B class");
	}

	public void m2() {
		System.out.println("M2() method of the B class");
	}
}

public class CheckTheFlow {
	public static void main(String[] args) {
		B b = new B();
		B.m1();
		b.m2();
	}
}

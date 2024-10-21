package com.te.true2java.flow.interface1;

//@FunctionalInterface
interface BBB {
	void m1();

	void m2();
}

class B2 implements BBB {

	@Override
	public void m1() {
		System.out.println("Bye");

	}

	@Override
	public void m2() {

	}

}

public class CC {

	public static void main(String[] args) {
		System.out.println("Hello");
		B2 b2 = new B2();
		b2.m1();

	}

}

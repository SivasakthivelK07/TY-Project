package com.te.true2java.flow.oops.inheritace;

//Compiler will ignore the @FunctionalInterface annotation because of the syntax wise Interface is correct 
//@FunctionalInterface 
interface Demo {
	void m1();

	void m2();
}

class A {
	public void m1() {
		System.out.println("Hi");
	}
}

class B extends A implements Demo {
	@Override
	public void m2() {
		System.out.println("Bye");

	}

}

public class MainTest {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();

	}

}

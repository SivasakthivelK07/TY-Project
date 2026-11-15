package com.te.true2java.stream;

class A {
}

class B {
	A m3() {
		return new A();
	}
}

class C {
	B m2() {
		return new B();
	}
}

public class MyStream2 {

	C m1() {
		return new C();
	}

	public static void main(String[] args) {
		MyStream2 stream = new MyStream2();
		A m4 = stream.m1().m2().m3();
		System.out.println(m4);
		// source-> intermediate-> terminal method
		// stream API-> functional programming-> pipeline of processing of data
		// Function interface -> functional programming

	}

}

package com.te.true2java.flow.abstraction;

class Test {
	void m1() {
		System.out.println("m1 method of Test class");
	}
}

abstract class Test1 extends Test {
	abstract void m1();
}

class Test3 extends Test1 {
	void m1() {
		System.out.println("m1 method of Test3 class");
	}
}

public class Demo {
	public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.m1();
		Test test = new Test();
		test.m1();
	}
}

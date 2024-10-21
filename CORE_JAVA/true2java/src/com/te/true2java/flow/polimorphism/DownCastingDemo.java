package com.te.true2java.flow.polimorphism;

class A {
	void m1() {
		System.out.println("m1() method");
	}
}

class B extends A {
	void m2() {
		System.out.println("m2() method");
	}
}

class C extends B {
	void m3() {
		System.out.println("m3() method");
	}
}

public class DownCastingDemo {
	public static void main(String[] args) {
		//parent class object does not have child class object
		//when ever we try to down casting C object will check for the they own properties if its not available we will get ClassCastException
		A a = new B();
		C c = (C) a;
		
	}
}

package com.te.true2java.flow.interface1;

public interface A {
	int a = 10;

	void m1();

	public static void m2() {
		System.out.println("Static method");
	}

	default void m3() {
		System.out.println("Default method");
	}
}

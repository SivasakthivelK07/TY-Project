package com.te.true2dsa.interview;

import java.lang.reflect.Method;

class A {
	public void m1() {
		System.out.println("Method from Class A");
	}
}

class B extends A {
	@Override
	public void m1() {
//		super.m1();
		System.out.println("Method from Class B");
	}
}

class C extends B {
	@Override
	public void m1() {
//		super.m1();
		System.out.println("Method from Class C");
	}
}

class D extends C {
	@Override
	public void m1() {
//		super.m1();
		System.out.println("Method from Class D");
	}
	  // Method to call Class A's m1() directly using reflection
    void callClassBM1() {
        try {
            // Use reflection to access Class A's m1() method
            Method method = B.class.getDeclaredMethod("m1");

            // Create an instance of Class A or invoke it on a new instance of A
            method.invoke(new B());  // Invoke on a new instance of Class A
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class OverrideMethodCallGrantParent {

	public static void main(String[] args) {
		D d = new D();
		d.m1();
		d.callClassBM1(); // Calls m1() from Class D
		
		
		
	}

}

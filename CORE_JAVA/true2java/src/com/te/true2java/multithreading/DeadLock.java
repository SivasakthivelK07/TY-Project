package com.te.true2java.multithreading;

class A {
	synchronized public void m1(B b) {
		System.out.println("m1() method is execution is start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1() method waiting for B lock");
		b.m4();

	}

	synchronized public void m2() {
		System.out.println("m2() method is executed");
	}

}

class B {
	synchronized public void m3(A a) {
		System.out.println("m3() method is execution is start");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m3() method is wait for A lock");
		a.m2();

	}

	synchronized public void m4() {
		System.out.println("m4() method is executed");
	}

}

public class DeadLock {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Runnable r1 = () -> a.m1(b);
		Runnable r2 = () -> b.m3(a);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}

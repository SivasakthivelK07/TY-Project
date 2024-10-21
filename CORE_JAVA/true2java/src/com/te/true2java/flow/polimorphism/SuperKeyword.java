package com.te.true2java.flow.polimorphism;

class Demo{
	int a=10;
	public static void m1() {
		System.out.println("Hello");
	}
}
class Test extends Demo{
	int a=100;
	public  void m2() {
		System.out.println(new Test().a);
		System.out.println(super.a);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Test test=new Test();
		test.m2();

	}

}

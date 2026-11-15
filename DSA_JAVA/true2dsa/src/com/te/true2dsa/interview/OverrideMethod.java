package com.te.true2dsa.interview;

class Demo {
	public void show() {
		System.out.println("Show method in parent class");
	}

}

class Test extends Demo {
	@Override
	public void show() {
		System.out.println("Show method in child class");
	}

}

public class OverrideMethod {
	public static void main(String[] args) {
		Test test = new Test();
		Demo d=test;
		d.show();
		
		Demo demo=new Test();
		Test test3=(Test)demo;
		Demo demo2=new Demo();
		Test test2=(Test)demo2;
		
		test3.show();
		demo2.show();
		test2.show();
		demo.show();
		test.show();
		
		
	}
}

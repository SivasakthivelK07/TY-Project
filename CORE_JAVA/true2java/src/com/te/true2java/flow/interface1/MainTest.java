package com.te.true2java.flow.interface1;

interface Demo {
	default void m1() {
		System.out.println("Hello");
	}
}
class Teast implements Demo{

	@Override
	public void m1() {
		System.out.println("Hi");
	}
	
}
public class MainTest {

	public static void main(String[] args) {
		Teast teast=new Teast();
		teast.m1();

	}

}

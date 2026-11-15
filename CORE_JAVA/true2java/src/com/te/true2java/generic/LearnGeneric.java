package com.te.true2java.generic;

class A<T> { // class A<String>{
	Integer x;
	T y; // String y
	T z; // String z
}

public class LearnGeneric {

	public static void main(String[] args) {
		A<String> a = new A<String>();
		System.out.println(a);
		a = null;

		System.out.println(a instanceof A);
		a.x = 10;
		a.y = "abcc";

		
	}

}

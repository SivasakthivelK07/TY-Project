package com.te.true2java.stream;

public class MyStream {

	MyStream m1() {
		System.out.println(this);
		return this;
	}

	MyStream m2() {
		System.out.println(this);
		return this;
	}

	MyStream m3() {
		return this;
	}

	MyStream m4() {
		return this;
	}

	public static void main(String[] args) {
		MyStream stream = new MyStream();
		MyStream m4 = stream.m1().m2().m3().m4();
		System.out.println(m4);

	}

}

package com.te.true2java.funtionaInterface;

public interface Function {
	public abstract void myAbstractMethod();

	public abstract void myAbstractMethod1();
}

class Demo1 {
	public void myAbstractMethod() {
		// code.....
	}

	public void myAbstractMethod1() {
		// code.....
	}

}

class Test1 extends Demo1 implements Function {

}
package com.te.true2java.funtionaInterface;

@FunctionalInterface
public interface MyFunctionInterface {

	public abstract void myAbstractMethod();
//	public abstract void myAbstractMethod1();

	public abstract int hashCode();
	public abstract String toString();
	public abstract boolean equals(Object o);

}


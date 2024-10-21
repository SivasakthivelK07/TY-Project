package com.te.true2dsa.interview;

public class SingleTonClass {

	private static SingleTonClass instance = null;

	private SingleTonClass() {
	}

	public static SingleTonClass getInstance() {
		if (instance == null) {
			instance = new SingleTonClass();
		}
		return instance;
	}

	public static void main(String[] args) {
		System.out.println(SingleTonClass.getInstance().hashCode());
		System.out.println(SingleTonClass.getInstance().hashCode());

		SingleTonClass class1 = SingleTonClass.getInstance();
		SingleTonClass class2 = SingleTonClass.getInstance();

		System.out.println(class1.hashCode() == class2.hashCode());
		System.out.println(class1.equals(class2));
	}

}

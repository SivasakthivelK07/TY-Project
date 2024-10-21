package com.te.true2java.multithreading;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread ");
		}
	}

}

public class MyOwnThread {

	public static void main(String[] args) {
		Thread myThread = new MyThread();
		System.out.println("Program started");
		myThread.setName("biswa");
		myThread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
		System.out.println("Program Ended");
	}

}

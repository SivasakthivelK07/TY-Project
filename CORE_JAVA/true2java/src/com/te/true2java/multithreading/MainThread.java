package com.te.true2java.multithreading;

class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MainThread {

	public static void main(String[] args) {
		MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
		Thread thread = new Thread(myThreadRunnable);
		Thread thread2 = new Thread();
		System.out.println("Program start");
		thread.run();
		thread2.start();
		myThreadRunnable.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}
		System.out.println("Program Ended");

	}

}

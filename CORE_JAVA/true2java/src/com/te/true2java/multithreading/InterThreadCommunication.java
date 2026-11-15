package com.te.true2java.multithreading;

class Compute {
	int total;

	public void total() {
		synchronized (this) {
			System.out.println("Computation is start");
			for (int i = 0; i < 200; i++) {
				total += i;
			}
			System.out.println("Cout is completed");
			this.notify();
		}
	}

	public void print() {
		synchronized (this) {
			System.out.println("Printing is started");
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(total);
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Compute compute = new Compute();
		Runnable runnable = () -> compute.total();
		Runnable runnable1 = () -> compute.print();
		Thread thread = new Thread(runnable);
		Thread thread1 = new Thread(runnable1);
		thread.start();
		thread1.start();
	}

}

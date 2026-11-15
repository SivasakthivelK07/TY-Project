package com.te.true2java.multithreading;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

	public void read() {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void write() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		name = "ThullathamanamumThullum";
	}

}

public class DataInconsistency {

	public static void main(String[] args) {
		Movie demo = new Movie("KGF Chapte1");
		Runnable r1 = () -> demo.read();
		Runnable r2 = () -> demo.write();
		Thread thread = new Thread(r1);
		Thread thread2 = new Thread(r2);
		thread2.start();
		thread.start();

	}

}

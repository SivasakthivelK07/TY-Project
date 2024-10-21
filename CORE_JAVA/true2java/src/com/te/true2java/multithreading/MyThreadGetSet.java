package com.te.true2java.multithreading;

public class MyThreadGetSet {

	public static void main(String[] args) {
		MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
		Thread thread = new Thread(myThreadRunnable);
		Thread thread2 = new Thread();
		System.out.println("=======Child Thread=======");
		System.out.println(thread.getName());
		System.out.println(thread2.getName());
		
//		thread.setName("Child Thread-1");
//		System.out.println(thread.getName());
//		System.out.println(thread2.getName());
		
//		System.out.println(thread.getPriority());
//		System.out.println(thread2.getPriority());
//		thread.setPriority(10);
//		System.out.println(thread.getPriority());
		
		System.out.println("=======Parent Thread/ Main Thread=========");
		System.out.println(Thread.currentThread());
		
//		Thread.currentThread().setName("Main Method Thread");
//		System.out.println(Thread.currentThread().getName());
//		
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
		
	}

}

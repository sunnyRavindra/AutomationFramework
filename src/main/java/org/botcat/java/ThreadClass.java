package org.botcat.java;

public class ThreadClass extends Thread {

	ThreadClass(String ThreadName) {
		super(ThreadName);
	}

	@Override
	public void run() {

		System.out.println("Thread Start : "  + Thread.currentThread().getName());

		System.out.println("Thread End : " + Thread.currentThread().getName());
	}
}

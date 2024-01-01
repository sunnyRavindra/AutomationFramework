package org.botcat.java;

public class RunnableClass implements Runnable {
	@Override
	public void run() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("Runnable class Thread name : " + Thread.currentThread().getName());
	}
}

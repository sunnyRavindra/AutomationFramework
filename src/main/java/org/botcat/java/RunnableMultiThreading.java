package org.botcat.java;

public class RunnableMultiThreading implements Runnable{

	@Override
	public void run() {

		System.out.println("Runnable Thread Name : " + Thread.currentThread().getName());
	}
}

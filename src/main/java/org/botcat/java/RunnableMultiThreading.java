package org.botcat.java;

import java.lang.Thread;
public class RunnableMultiThreading implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Runnable Thread Name : " + Thread.currentThread().getName());
	}
}

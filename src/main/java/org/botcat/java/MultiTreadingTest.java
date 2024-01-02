package org.botcat.java;

public class MultiTreadingTest {
	public static void main(String[] args) {
//		ThreadMultiThreading t1 = new ThreadMultiThreading();
//		RunnableMultiThreading m1 = new RunnableMultiThreading();

//
//		Thread t3 = new Thread("t3 Thread");
//
//		t1.start();
//		t2.start();
//		t3.start();
//		Thread thread4  = new Thread(m1,"new thread");
//		thread4.start();
//
//
//
//		System.out.println(t3.getName());
//


	Thread t1 = new ThreadMultiThreading();

	t1.start();

	System.out.println("Main Thread Name : " + Thread.currentThread().getName());



	}
}

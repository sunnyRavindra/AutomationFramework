package org.botcat.java;

public class ThreadMultiThreading extends Thread {
	@Override
	public void run() {
		System.out.println("--------- Run Start -------");
		System.out.println("Comming from Run method from ThreadMultiThreading Class");
		System.out.println("Thread Name from inside classs : " + getName());
		System.out.println("--------- Run End-------");
	}
}

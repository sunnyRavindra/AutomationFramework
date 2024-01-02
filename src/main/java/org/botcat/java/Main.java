package org.botcat.java;

public class Main {
	public static void main(String[] args) {
		DataTypes dataTypes = new DataTypes();
		dataTypes.printDataTypes();

		ControlStatements controlStatements = new ControlStatements();
		controlStatements.basicSwitch(4);
		controlStatements.basicSwitchVariation(2);
//		controlStatements.enhanceSwitch(3);
		controlStatements.forLoop();
		controlStatements.forLoop(false);
		controlStatements.stringLitarals();
		controlStatements.ternary();
		// Current Thread
		System.out.println("main Thread Start: " + Thread.currentThread().getName());

		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new ThreadClass("Thread " + i).start();
		}

		// Current Thread
		System.out.println("main Thread End : " + Thread.currentThread().getName());

	}
}

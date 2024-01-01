package org.botcat.java;

public class ControlStatements extends DataTypes {

	protected void forLoop(boolean falseBoolean) {
		// Conditional Statements
		if (falseBoolean = false) {
			System.out.println("falseBoolean is false");
		} else if (falseBoolean != false) {
			System.out.println("falseBoolean is not false but can be anything else");
		} else {
			System.out.println("going in else block");
		}
	}

	protected void ternary() {
		Boolean ternaryOperator = newInt == 100 ? false : true;
	}

	protected void stringLitarals() {
		System.out.printf(
				"%d is a integer and" + " %s is a string, " + "\\ can escape the characters, "
						+ "/t \\t will enter a tab in the string, " + "\\n will enter a nextline in a string line",
				5, "STRING");
	}

	protected void forLoop() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("The value of i is : " + i);
		}
		int j = 0;
		while (j < 10) {
			System.out.println("value of j is : " + j);
			j++;
		}
	}

	protected void basicSwitch(int Switch1) {
		switch (Switch1) {
		case (1):
			System.out.println("Coming from case 1");
			break;
		case (2):
			System.out.println("Coming from case 2");
			break;
		default:
			System.out.println("Coming from default");
		}
	}

	protected void basicSwitchVariation(int Switch2) {
		switch (Switch2) {
		case (1):
			System.out.println("Coming from case 1");
			break;
		case (2):
		case (3):
		case (4):
		case (5):
			System.out.println("Coming from case 2,3,4,5");
			break;
		default:
			System.out.println("Coming from default state");
		}
	}

	protected void enhanceSwitch(int Switch) {
		switch (Switch) {
		case 1 -> System.out.println("This is coming from case 1");
		case 2 -> System.out.println("This is coming from case 2");
		case 3, 4, 5 -> System.out.println("This is coming from case 3,4,5");
		default -> System.out.println("This is coming from Default");
		}
	}

}
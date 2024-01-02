package org.botcat.java;

public enum JavaEnum {
	ENUM1,ENUM2,ENUM3;

	public void enumValue() {
		if(this == ENUM1) {
			System.out.println("This is ENUM1");
		}
	}
}

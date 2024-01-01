package org.botcat.java;

public abstract class AbstractAnimal {

	private String type;
	private String name;
	private String weight;
	private String height;

	public AbstractAnimal(String type, String name, String weight, String height) {
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.height = height;
		System.out.println("Coming from Parent Abstract class");
	}
	
	public abstract String getType();

	public abstract void setType(String type);
	
	public void parentAbstractClassMethod() {
		System.out.println("this is a Parent Abstract Class Method");
	}

}

package org.botcat.java;

public class ParentDog extends AbstractAnimal {

public ParentDog(String type, String name, String weight, String height) {

		super(type, name, weight, height);
		System.out.println("Coming from Dog Child class");
	}

//	private String Bread;
//	private String dogColor;
//
//	public Dog(String bread, String dogColor) {
//		super("Default Value", "Default Value", "Default Value", "Default value");
//		Bread = bread;
//		this.dogColor = dogColor;
//	}
//
//	public String getBread() {
//		return Bread;
//	}
//
//	public void Bread() {
//		System.out.println("Bread Coming from Dog");
//	}
//
//	public void setBread(String bread) {
//		Bread = bread;
//	}
//
//	public String getDogColor() {
//		return dogColor;
//	}
//
//	public void setDogColor(String dogColor) {
//		this.dogColor = dogColor;
//	}
//
//	@Override
//	public String toString() {
//		return "Dog [Bread=" + Bread + ", dogColor=" + dogColor + "]";
//	}
//
	@Override
	public String getType() {
		System.out.println("Coming from child class getType method");
		return "Some String";
	}

	@Override
	public void setType(String type) {
		System.out.println("Coming from child class setType method");
	}
	
	public void DogMethod() {
		System.out.println("This is from Dog Methods");
	}

}

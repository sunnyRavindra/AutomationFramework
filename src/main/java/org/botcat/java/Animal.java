package org.botcat.java;

public class Animal {

	private String type;
	private String name;
	private String weight;
	private String height;

	public Animal(String type, String name, String weight, String height) {
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

	public void move(String speed) {
		System.out.println("Animal is moving with the speed" + speed + " coming from Animal class");
	}

	public void makeNoise() {
		System.out.println("Animal making Noise coming from Animal Class");
	}

	public void Bread() {
		System.out.println("Bread Coming from Animal");
	}

}

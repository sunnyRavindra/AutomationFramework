package org.botcat.java;

public class ChildDog extends ParentDog implements InterfaceAnimal {

	public ChildDog(String type, String name, String weight, String height) {
		super(type, name, weight, height);
		System.out.println("Constructor from BullDog");
	}

	public void getBulldog() {
		System.out.println("Coming fro Bulldog from Dog Class");
	}

	@Override
	public void DogMethod() {
		System.out.println("This is from BullDog Methods");
	}

//	@Override
//	public void normalInterfaceMethods() {
//		System.out.println("Interface Overriden methods");
//	}
//
//	@Override
//	public void defaultInterfaceMethods() {
//		System.out.println("Ovverriden method from Interface");
//	}

}

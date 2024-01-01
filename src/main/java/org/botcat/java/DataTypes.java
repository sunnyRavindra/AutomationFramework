package org.botcat.java;

public class DataTypes {

	// Primitive data types
	protected byte newByte = 127;
	protected short newShort = 32000;
	protected int newInt = 1000000;
	protected long newLong = 10000000L;
	protected char newChar = 'A';
	protected float newFloat = 0.01f;
	protected double newDouble = 0.02d;
	protected boolean newFalseBoolean = false;
	protected boolean newTrueBoolean = true;
	// BigDecimal BigDecimal = 0.01;

	public void printDataTypes() {
		System.out.println("byte :" + newByte + "short :" + newShort + "int :" + newInt + "long :" + newLong + "char :"
				+ newChar + "float :" + newFloat + "double :" + newDouble + "booleanfalse :" + newFalseBoolean
				+ "booleantrue :" + newTrueBoolean);
	}
}

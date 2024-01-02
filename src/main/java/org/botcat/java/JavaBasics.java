package org.botcat.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaBasics {

	public static void main(String[] args) {

		/*------------Variables-------------*/
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		char noCharClass = 'A';
		float egFloat = 0.01f;
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		double egDouble = 0.02d;
		double minDouble = Double.MIN_VALUE;
		BigDecimal bigDecimal = new BigDecimal("0.1111111111111");
		double maxDouble = Double.MAX_VALUE;
		boolean falseBoolean = false;
		boolean trueBoolean = true;

		System.out.println("\nMin Byte :" + minByte + "\nMax Byte : " + maxByte + "\nMin Short :" + minShort
				+ "\nMax Short : " + maxShort + "\nMin Int : " + minInt + "\nMax Int : " + maxInt + "\nMin Long : "
				+ minLong + "\nMax Long : " + maxLong + "\nMin Float : " + minFloat + "\nMax Float : " + maxFloat
				+ "\nMin Double : " + minDouble + "\nMax Double : " + maxDouble + " \nFalse Boolean : " + falseBoolean
				+ "\nTrue Boolean" + trueBoolean + "\nbigDecimal : " + bigDecimal);

		/*------------String Literals-------------*/
		System.out.printf(
				"%d is a integer and" + " %s is a string, " + "\\ can escape the characters, "
						+ "/t \\t will enter a tab in the string, " + "\\n will enter a nextline in a string line",
				5, "STRING");

		/*------------Parse Data-------------*/
		String number1 = "1";
		String number2 = "2";
		String number3 = "0.1";
		String number4 = "0.2";
		int parsedValue1 = Integer.parseInt(number1);
		int parsedValue2 = Integer.parseInt(number2);
		System.out.println(parsedValue2 + parsedValue2);
		double parsedValue3 = Double.parseDouble(number3);
		double parsedValue4 = Double.parseDouble(number4);
		System.out.println(parsedValue1 + parsedValue2);
		System.out.println(parsedValue3 + parsedValue4);

		/*------------Switch Statement-------------*/
		int Switch1 = 5;
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

		switch (Switch1) {
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

		/*------------If Else-------------*/
		if (falseBoolean = false) {
			System.out.println("falseBoolean is false");
		} else if (falseBoolean) {
			System.out.println("falseBoolean is not false but can be anything else");
		} else {
			System.out.println("going in else block");
		}

		/*------------Ternary Operator-------------*/
		int newInt = 100;
		boolean ternaryOperator = newInt == 100 ? false : true;

		/*------------Arrays-------------*/
		int[] arrayInt = new int[10];
		double[] arrayDouble = new double[10];
		int[] arrayInitialize = { 1, 2, 3, 4 };
		String[] arrayString = { "one", "two", "three" };
		int[][] D3Array = new int[3][3];
		int[][] D4Array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		arrayInt[0] = 12;
		arrayDouble[0] = 12.1;

		int Len = arrayDouble.length;
		Arrays.toString(D4Array);
		Arrays.sort(arrayInitialize);

		/*------------ArrayList-------------
		 Array list can double the size on addition and copy the elements to new array
		 Hence adding will have 0(1) until the length is reached.
		 Accessing an element is 0(1)
		 Searching is 0(n)
		 ArrayList are better for getting data from
		 */
		List<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 2, 3));

		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.remove(2);
		arrayList.get(1);

		System.out.println("Array List :" + arrayList);
		System.out.println("Array List2 :" + arrayList2);

		/*------------Linked List-------------
		 Linked list will traverse to the middle element from head or tail (can be
		 expensive)
		 Inserting and removing is cheap 0(1)
		 Hence searching is 0(n)
		 Adding is less expensive as just links needs to be replaced no traversal
		 Linked List is better for adding and removing data
		 */
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		linkedList.add(1);
		linkedList.get(4);
		linkedList.addFirst(2);
		linkedList.addLast(4);
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.push(1);
		linkedList.pop();

		System.out.println("Linked List :" + linkedList);

		for (int element : linkedList) {
			System.out.println("Enhanced For Loop of Linked List : " + element);
		}

		ListIterator<Integer> iterator = linkedList.listIterator();

		while (iterator.hasNext()) {
			System.out.println("Print Linked List from iteraator : " + iterator.next());
		}

		/*------------Autoboxing-------------
		 Integer myInt = 15; this is a form of Autoboxing in java , where java takes
		 care of creating the new Object of int
		 Autoboxing in java is done on wrapper classes
		 */

		/*------------Enum-------------
		public enum JavaEnum{
					ENUM1,ENUM2,ENUM3
		}*/
		JavaEnum javaEnum = JavaEnum.ENUM1;
		javaEnum.enumValue();
		System.out.println(javaEnum);

		/*------------Read Input-------------
		try {
			String Name = System.console().readLine("what is your name : ");
			System.out.println(Name);
		} catch (NullPointerException e) {
			System.out.println(
					"System.console().readline() will not work in IDE hence this should be run from the terminal, also use scanner instead");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name comming from Scanner :");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + " from scanner.");
		*/

		/*------------Abstract Class-------------*/
		ParentDog abstractDog = new ParentDog("Name","Weight","height","number");

		abstractDog.getType();
		abstractDog.setType("This is some type");
		abstractDog.parentAbstractClassMethod();

		/*------------Runtime Polymorphism-------------*/
		ChildDog childDog = new ChildDog(number4, number4, number4, number4);

		ParentDog parentDog = new ChildDog(number4, number4, number4, number4);

		//In abstract calss you have have variables and constructor
		//You can have private methods
		//Abstract class cannot be private
		//This calls method from childclass
		parentDog.DogMethod();

		//This calls method from childclass
		childDog.DogMethod();

		//Interface cannot be private
		//In Interface no constructor is created
		//Only Public Static Final Variables can be declared
		//can have methods with body but has to be default and static
		//Interfaces can extend other multiple interfaces, you can not use implements keyword in interface
//		childDog.defaultInterfaceMethods();

		/*------------End-------------*/
	}
}

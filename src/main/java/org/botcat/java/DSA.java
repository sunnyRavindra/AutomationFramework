package org.botcat.java;

public class DSA {

	public boolean PRIMENUMBER(int WholeNumbers) {

		if (WholeNumbers <= 2) {
			return (WholeNumbers == 2);
		} else {
			for (int i = 2; i <= WholeNumbers; i++) {
				return !(WholeNumbers % i == 0);
			}
		}
		return true;
	}

	public int COUNTPRIME(int WN) {
		int count = 0;
		if (WN <= 2) {
			return (WN == 2 ? 1 : 0);
		}
		count++;
		for (int i = 3; i < WN; i++) {
			if (WN % i != 0) {
				count++;
			}
		}

		return count;
	}

	public boolean ISLEAPYEAR(int year) {

		if (year <= 0) {
			return false;
		}
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static int SUMDIGITS(int number) {

		int sum = 0;

		if (number < 0) {
			return -1;
		}

		if (number <= 9) {
			return number;
		}

		int i = number;
		while (i < 10) {
			// (number % 10) +
		}

		return sum;

	}

	public boolean isPalindrome(int Number) {
		// If the number is palindrom number or not
		// 101
		int tempNumber = 0;
		for (int number = Number; number < 10; number = number - (number % 10)) {
			tempNumber = tempNumber + (number % 10);
		}

		return false;
	}

	public void sumFirstAndLastDigit() {
//		write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//		The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
	}

	// Sum Odd number
	// Sum of all even digits in a number

//    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

//	Last Digit Checker
//
//	Write a method named hasSameLastDigit with three parameters of type int.
//
//	Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//	The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
//
//
//	EXAMPLE INPUT/OUTPUT:
//
//	    hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//
//	    hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//
//	    hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
//
//
//	Write another method named isValid with one parameter of type int.
//
//	The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
//
//	EXAMPLE INPUT/OUTPUT
//
//	    isValid(10); → should return true since 10 is within the range of 10-1000
//
//	    isValid(468); → should return true since 468 is within the range of 10-1000
//
//	    isValid(1051); → should return false since 1051 is not within the range of 10-1000
//
//
//	NOTE: All methods need to be defined as public static as we have been doing so far in the course.
//
//	NOTE: Do not add a main method to the solution code.

//	All Factors
//
//	Write a method named printFactors with one parameter of type int named number.
//
//	If number is < 1, the method should print "Invalid Value".
//
//	The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
//
//	For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
//
//
//	EXAMPLE INPUT/OUTPUT:
//
//	    printFactors(6); → should print 1 2 3 6
//
//	    printFactors(32); → should print 1 2 4 8 16 32
//
//	    printFactors(10); → should print 1 2 5 10
//
//	    printFactors(-1); → should print "Invalid Value" since number is < 1
//
//
//	HINT: Use a while or for loop.
//
//
//	NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.
//
//	For example, the printout for printFactors(10); can be:
//
//	    1
//	    2
//	    5
//	    10
//
//	NOTE: The method printFactors​ should be defined as public static like we have been doing so far in the course.
//
//	NOTE: Do not add a main method to the solution code.

//	Greatest Common Divisor
//
//	Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//
//	If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//
//	The method should return the greatest common divisor of the two numbers (int).
//
//	The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
//
//
//	For example 12 and 30:
//
//	12 can be divided by 1, 2, 3, 4, 6, 12
//
//	30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//
//	The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
//
//
//	EXAMPLE INPUT/OUTPUT:
//
//	    getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
//
//	    getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
//
//	    getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
//
//	    getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
//
//
//	HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
//
//	HINT: Find the minimum of the two numbers.
//
//
//	NOTE: The method getGreatestCommonDivisor​ should be defined as public static like we have been doing so far in the course.
//
//	NOTE: Do not add a main method to the solution code.

//	Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//
//	Check that number is > 0, if it is not return false.
//
//	If number is odd return true, otherwise return false.
//
//	Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//
//	The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
//
//	It should call the method isOdd to check if each number is odd.
//
//	The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//
//	If those conditions are not satisfied return -1 from the method to indicate invalid input.true

	// Is number even number or not use while or do while loop

	// how many even and odd numbers are there in between the range given use while
	// or do while loop

	// Also make cure that you are using the continue keyword, also understand where
	// else can we use the word other than while loop

//	Perfect Number
//
//	What is the perfect number?
//	A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//	Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
//	For example, take the number 6:
//	Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
//
//	Therefore, 6 is a perfect number (as well as the first perfect number).
//
//
//	Write a method named isPerfectNumber with one parameter of type int named number.
//
//	If number is < 1, the method should return false.
//
//	The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.
//
//
//	EXAMPLE INPUT/OUTPUT:
//
//	    isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
//
//	    isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
//
//	    isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
//
//	    isPerfectNumber(-1); should return false since the number is < 1
//
//
//	HINT: Use a while or for loop.
//
//	HINT: Use the remainder operator.
//
//	NOTE: The method isPerfectNumber ​should be defined as public static like we have been doing so far in the course.
//
//	NOTE: Do not add a main method to the solution code.

//	Number To Words
//
//	Write a method called numberToWords with one int parameter named number.
//
//	The method should print out the passed number using words for the digits.
//
//	If the number is negative, print "Invalid Value".
//
//	To print the number as words, follow these steps:
//
//	    Extract the last digit of the given number using the remainder operator.
//
//	    Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//
//	    Remove the last digit from the number.
//
//	    Repeat Steps 2 through 4 until the number is 0.
//
//	The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
//
//	The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//
//	Use the method reverse within the method numberToWords in order to print the words in the correct order.
//
//	Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//
//	The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
//	For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
//
//	Example Input/Output - getDigitCount method
//
//	    getDigitCount(0); should return 1 since there is only 1 digit
//
//	    getDigitCount(123); should return 3
//
//	    getDigitCount(-12); should return -1 since the parameter is negative
//
//	    getDigitCount(5200); should return 4 since there are 4 digits in the number
//
//	Example Input/Output - reverse method
//
//	    reverse(-121); should  return -121
//
//	    reverse(1212); should return  2121
//
//	    reverse(1234); should return 4321
//
//	    reverse(100); should return 1
//
//	Example Input/Output - numberToWords method
//
//	    numberToWords(123); should print "One Two Three".
//
//	    numberToWords(1010); should print "One Zero One Zero".
//
//	    numberToWords(1000); should print "One Zero Zero Zero".
//
//	    numberToWords(-12); should print "Invalid Value" since the parameter is negative.
//
//
//	HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.
//
//	NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
//
//	    One
//	    Two
//	    Three
//
//	They don't have to be separated by a space.
//
//	NOTE: The methods numberToWords, getDigitCount, reverse should be defined as public static like we have been doing so far in the course.
//	NOTE: In total, you have to write 3 methods.
//
//	NOTE: Do not add a main method to the solution code.
}

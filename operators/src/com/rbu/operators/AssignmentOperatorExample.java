package com.rbu.operators;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		// assign my name Naveen into variable name
		String myName = "Naveen";
		System.out.print("Name =");
		System.out.println(myName);
		int myAge = 30;
		System.out.print("Age =");
		System.out.println(myAge);

		int x = 5;
		int y = 10;

		// Assignment operator (=)
		int result = x + y;
		System.out.println("Result after addition: " + result);

		// Add and assign (+=) operator
		result += 3; // equivalent to: result = result + 3;
		System.out.println("Result after adding 3: " + result);

		// Subtract and assign (-=) operator
		result -= 7; // equivalent to: result = result - 7;
		System.out.println("Result after subtracting 7: " + result);

		// Multiply and assign (*=) operator
		result *= 2; // equivalent to: result = result * 2;
		System.out.println("Result after multiplying by 2: " + result);

		// Divide and assign (/=) operator
		result /= 4; // equivalent to: result = result / 4;
		System.out.println("Result after dividing by 4: " + result);

		// Modulus and assign (%=) operator
		result %= 3; // equivalent to: result = result % 3;
		System.out.println("Result after taking modulus by 3: " + result);

	}

}

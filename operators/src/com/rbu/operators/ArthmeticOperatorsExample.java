package com.rbu.operators;
//+,-,*,/,%
public class ArthmeticOperatorsExample {
	public static void main(String[] args) {
		// (+) operator
		int bookPrice = 100;
		// what is the total price with GST 18%
		int finalBookPrice = bookPrice + 18; // used arithmetic plus(+) operator for addition
		System.out.print("Final Book price=");
		System.out.println(finalBookPrice);

		// (-) operator
		int laptopPrice = 50000;
		// what is the price after 5000 discount
		int laptopFinalPrice = laptopPrice - 5000;// used arithmetic minus(-) operator for addition
		System.out.print("Laptop Final price=");
		System.out.println(laptopFinalPrice);

		// (*) operator
		int milkPacketPrice = 30;
		// what is the price for 3 packets
		int milkPacketPriceTotal = milkPacketPrice * 3;// used arithmetic multiplier(*) operator for multiplication
		System.out.print("3 Milk packets price=");
		System.out.println(milkPacketPriceTotal);

		// (/) operator
		int totalTripSpendings = 45000;
		// what is the share of each person in 5 people group
		int perHeadShare = totalTripSpendings / 5;// used arithmetic divide (/) operator for division
		System.out.print("Per Head Share =");
		System.out.println(perHeadShare);

		// (%) operator
		int givenNumber = 4;
		// to know the given number is even or odd
		int evenOrodd = givenNumber % 2;// used arithmetic modulo (%) operator for to get the modulo value in division
		if (evenOrodd == 0) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is odd");
		}

	}
}

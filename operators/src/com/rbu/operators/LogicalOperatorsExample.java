package com.rbu.operators;

public class LogicalOperatorsExample {

	public static void main(String[] args) 
	{
		// Declare and initialize byte variables
		byte myAge = 30;
		byte mysonAge = 6;

		// Me and MySon both allowed for voting check using logical and (&&) operator
		boolean bothAllowed = (myAge > 19) && (mysonAge > 19);
		System.out.println("Both Are Allowed =" + bothAllowed);

		// Me or Myson at least one allowed for voting check using logical or (||)
		// operator
		boolean atLeastOneAllowed = (myAge > 19) || (mysonAge > 19);
		System.out.println("At least one allowed to vote=" + atLeastOneAllowed);

		// inverse condition from true to false or false to true using logical nor !
		// operator
		boolean goingSchool = !(mysonAge > 19);
		System.out.println("He can go to school=" + goingSchool);
		
		boolean kidIsAllowedForSelfDrive=(mysonAge > 16) && isHavingCar();
		System.out.println("KID allowed for driving="+kidIsAllowedForSelfDrive);
	
	}
	
	public static boolean isHavingCar() {
		System.out.println("His Father ownes Maruthi 800");
		return true;
	}
	

}
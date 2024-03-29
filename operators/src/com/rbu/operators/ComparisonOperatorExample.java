package com.rbu.operators;
//==, !=, <, >, <=, >=
public class ComparisonOperatorExample 
{
	public static void main(String[] args) 
	{
		//results boolean when we use this operators
		
       // Declare and initialize variables
        int x = 5;
        int y = 10; 

        // Equality check
        boolean isEqual = (x == y);
        System.out.println("Is x equal to y? " + isEqual);

        // Inequality check
        boolean isNotEqual = (x != y);
        System.out.println("Is x not equal to y? " + isNotEqual);

        // Greater than check
        boolean isGreaterThan = (x > y);
        System.out.println("Is x greater than y? " + isGreaterThan);

        // Less than check
        boolean isLessThan = (x < y);
        System.out.println("Is x less than y? " + isLessThan);

        // Greater than or equal to check
        boolean isGreaterOrEqual = (x >= y);
        System.out.println("Is x greater than or equal to y? " + isGreaterOrEqual);

        // Less than or equal to check
        boolean isLessOrEqual = (x <= y);
        System.out.println("Is x less than or equal to y? " + isLessOrEqual);
    
		
	}

}

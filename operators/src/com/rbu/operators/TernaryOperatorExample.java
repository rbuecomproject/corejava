package com.rbu.operators;
public class TernaryOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        // Using ternary operator to find the maximum of two numbers
        int max = (x > y) ? x : y;
        System.out.println("Maximum of " + x + " and " + y + " is: " + max); // Output: Maximum of 10 and 5 is: 10
        
        // Ternary operator can also be used in assignment
        String result = (x % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number " + x + " is: " + result); // Output: The number 10 is: Even
    }
}

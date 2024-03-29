package com.rbu.operators;
public class UnaryOperatorsExample {
    public static void main(String[] args) {
        int x = 10;
        // Unary plus (+)
        int y = +x; // y will be 10 (positive value)
        
        // Unary minus (-)
        int z = -x; // z will be -10 (negative value)
        
        // Increment (++)
        int a = 5;
        a++; // Increment a by 1
        System.out.println("Incremented a: " + a); // Output: Incremented a: 6
        
        // Decrement (--)
        int b = 8;
        b--; // Decrement b by 1
        System.out.println("Decremented b: " + b); // Output: Decremented b: 7
        
        // Logical complement (!)
        boolean isTrue = true;
        boolean isFalse = !isTrue; // Negating the value of isTrue
        System.out.println("isFalse: " + isFalse); // Output: isFalse: false
    }
}

package com.rbu.operators;
public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        // Bitwise AND (&)
        int x = 5;  // Binary representation:000000000000000000...101
        int y = 3;  // Binary representation: 00000000000000000000011
        int resultAnd = x & y; // Binary result: 001 (1 in decimal)
        System.out.println("Bitwise AND: " + resultAnd); // Output: 1
        
        // Bitwise OR (|)
        int resultOr = x | y; // Binary result: 111 (7 in decimal)
        System.out.println("Bitwise OR: " + resultOr); // Output: 7
        
        // Bitwise XOR (^)
        int resultXor = x ^ y; // Binary result: 110 (6 in decimal)
        System.out.println("Bitwise XOR: " + resultXor); // Output: 6
        
        // Bitwise Complement (~)
        int a = 5;  // Binary representation: 000...0000101
        int resultComplement = ~a; // Binary result: 111...1111010 (assuming 32-bit integer)
        System.out.println("Bitwise Complement: " + resultComplement); // Output: -6
        
        // Left Shift (<<)
        int b = 5;  // Binary representation: 000...0000101
        int resultLeftShift = b << 2; // Binary result: 000...00010100 (20 in decimal)
        System.out.println("Left Shift: " + resultLeftShift); // Output: 20
        
        // Right Shift (>>)
        int c = 20; // Binary representation: 000...00010100
        int resultRightShift = c >> 2; // Binary result: 000...00000010 (2 in decimal)
        System.out.println("Right Shift: " + resultRightShift); // Output: 2
        
        // Unsigned Right Shift (>>>)
        int d = -20; // Binary representation: 111...111011100
        int resultUnsignedRightShift = d >>> 2; // Binary result: 001111111111011100 (1073741819 in decimal)
        System.out.println("Unsigned Right Shift: " + resultUnsignedRightShift); // Output: 1073741819
    }
}

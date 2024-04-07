/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercises on looping with while and do-while
 */
package com.example.jaba.m5.s7.ex;

/**
 * Divide an even number by two, repeat until the result is odd
 */
public class EHalveEven {
    /**
     * Generate a sequence of even numbers, dividing the initial value by two, end
     * the iteration when the first odd result is found
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int x = 64;
        System.out.println("The initial value is " + x);

        // TODO: if x is even, print it, halve it, and repeat
        System.out.println("The expected result is: 64 32 16 8 4 2");
    }
}

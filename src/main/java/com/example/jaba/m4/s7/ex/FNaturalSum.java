/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercises on looping with while and do-while
 */
package com.example.jaba.m4.s7.ex;

/**
 * Natural sum
 */
public class FNaturalSum {
    /**
     * Generate the natural sequence up to n (included), sum up all its elements
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // The n value should be a natural number: 1, 2, ...
        int n = 64;

        System.out.println("The initial value is " + n);

        // TODO: Calculate and print the sum of 1 + 2 + ... + x

        // To check it, let's use the Gauss summation formula
        System.out.println("The result should be " + (n * (n + 1) / 2));
    }
}

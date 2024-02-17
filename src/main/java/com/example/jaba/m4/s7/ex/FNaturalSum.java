/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercises on looping
 */
package com.example.jaba.m4.s7.ex;

/**
 * Exercise on loop with while / do-while
 */
public class FNaturalSum {
    public static void main(String[] args) {
        // The x value should be a natural number: 1, 2, ...
        int x = 64;

        System.out.println("The initial value is " + x);

        // TODO: Calculate and print the sum of 1 + 2 + ... + x

        // To check it, let's use the Gauss summation formula
        System.out.println("The result should be " + (x * (x + 1) / 2));
    }
}

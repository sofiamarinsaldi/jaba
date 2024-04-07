/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercise on continue in a loop
 */
package com.example.jaba.m5.s9.ex;

import java.util.Arrays;

/**
 * Continue the loop, skipping the final part of the current block execution,
 * under a given condition
 */
public class Continue {
    /**
     * Interrupt a loop, execute the next statement
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO 1: given a sequence of integers
        // 1. add up its even values, or continue
        // 2. print the result
        int[] values = { 12, 2, 32, 41, 52, 18 };
        System.out.println("Values is " + Arrays.toString(values));
        System.out.println("Print the sum of its even values");

        // TODO 2: rewrite the loop above, but not using the continue statement
    }
}

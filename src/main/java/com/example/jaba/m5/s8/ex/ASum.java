/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercises on for loop
 */
package com.example.jaba.m5.s8.ex;

import java.util.Arrays;

/**
 * Operate on each element in a sequence with a for loop
 */
public class ASum {
    /**
     * The square operation should be applied on each element in the sequence and
     * its result would concur to the result
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: given a sequence of integers, generate the sum of each squared element
        int[] values = { 1, 2, 3, 4, 5 };
        System.out.println("Values is " + Arrays.toString(values));
        System.out.println("The expected result is 55");
    }
}

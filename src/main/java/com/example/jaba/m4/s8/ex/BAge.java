/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercises on for loop
 */
package com.example.jaba.m4.s8.ex;

import java.util.Arrays;

/**
 * Operate on each element in a sequence with a for loop
 */
public class BAge {
    /**
     * The given array contains the age of a group of people. We want to know the
     * mean age value
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: given a sequence of integers, calculate the average (as double)
        int[] ages = { 21, 42, 37, 15 };
        System.out.println("Ages are " + Arrays.toString(ages));
        System.out.println("The expected result is 28.75");
    }
}

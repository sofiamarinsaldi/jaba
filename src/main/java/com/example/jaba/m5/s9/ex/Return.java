/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercise on returning in a loop
 */
package com.example.jaba.m5.s9.ex;

import java.util.Arrays;

/**
 * Break the loop if a terminator is found before its natural end
 */
public class Return {
    /**
     * Interrupt a loop when required
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: given a sequence of integers
        // 1. add up its initial even values
        // 2. stop looping when the first odd value is found
        // 3. print the result and return
        int[] values = { 12, 2, 32, 41, 52, 18 };
        System.out.println("Values is " + Arrays.toString(values));
        System.out.println("Print the sum of its initial even values");

        // put your loop here below

        // leave this print statement, that should not to executed when the loop works
        // as expected
        System.out.println("Done");
    }
}

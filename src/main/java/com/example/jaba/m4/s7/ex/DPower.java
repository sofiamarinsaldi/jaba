/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercises on looping with while and do-while
 */
package com.example.jaba.m4.s7.ex;

/**
 * Given a (small) integer calculate the powers up to a given exponent
 */
public class DPower {
    /**
     * Generate the first few powers of a given value
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        final int a = 3;
        System.out.println("x is " + a);

        final int x = 4;
        System.out.println("x is " + x);

        // TODO: Calculate and print a^0, a^1, ..., a^x
        System.out.println("3^0 is 1, 3^1 is 3, 3^2 is 9, 3^3 is 27, 3^4 is 81");
    }
}

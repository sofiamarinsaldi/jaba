/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s4.ex;

/**
 * Switch on enum exercise
 */
public class EnumCalculator {
    /**
     * Switch on an enum
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 42;
        int b = 7;

        Operation op = Operation.ADD;

        if (op == Operation.ADD) {
            System.out.println("The sum of a and b is " + (a + b));
        }

        // TODO: switch on op to operate on a and b with the basic arithmetic operations
        System.out.println("The [sum/subtraction/division/product] of a and b is ... ");
    }
}

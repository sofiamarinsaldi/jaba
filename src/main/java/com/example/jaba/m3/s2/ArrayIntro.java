/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s2;

/**
 * Defining and using an array with the standard initialization
 */
public class ArrayIntro {
    public static void main(String[] args) {
        // Array with length 6, each element is initialized to zero
        int[] values = new int[6];

        // Explicit initialization of array elements
        values[0] = 734;
        values[1] = 512;
        // ...
        values[4] = 187;
        values[5] = 345;

        System.out.print("First element is ");
        System.out.println(values[0]);

        System.out.print("Last element is ");
        System.out.println(values[values.length - 1]);

        int value = values[3];
        System.out.print("Value is ");
        System.out.println(value);

        // !!! be careful with indices !!!
//        value = values[6]; // exception

        // unfortunately this does not work as one would expect
        // see Arrays (next slide) for solution
        System.out.print("The array is ");
        System.out.println(values);

        System.out.println("Done");
    }
}

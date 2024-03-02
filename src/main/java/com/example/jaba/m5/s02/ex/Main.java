/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercise on invoking methods
 */
package com.example.jaba.m5.s02.ex;

/**
 * Invoking methods
 * 
 * @see Simple the referenced class
 */
public class Main {
    /**
     * Invoke methods from a custom class
     * 
     * @param args not used
     * @see Simple a class with methods invoked here
     */
    public static void main(String[] args) {
        final int x = 6;
        System.out.println("x is " + x);
        final int y = 7;
        System.out.println("y is " + y);

        // TODO 1: call the static Simple method add()
        // then print the returned value
        System.out.println("Adding x and y gives ...");

        // TODO 2: call the Simple instance method multiply()
        // then print the returned value
        // to call instance methods we need a reference to an object of that class
        System.out.println("Multiplying x and y gives ...");
    }
}

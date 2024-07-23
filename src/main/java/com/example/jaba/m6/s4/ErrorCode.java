/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m6.s4;

/**
 * Bad argument signaled by error code
 */
public class ErrorCode {
    /**
     * When calling Math.sqrt() we should remember to check the returned value (if
     * we are not dead sure about the argument). Otherwise we could have an
     * unexpected NaN in a variable.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        double[] arguments = { 42.0, 0.0, -1.0 };

        // !!! unsafe !!!
        for (double arg : arguments) {
            double radix = Math.sqrt(arg);
            // We should not use the returned value without checking it!
            System.out.println("Square root of " + arg + " is " + radix);
        }
        System.out.println();

        // safer
        for (double arg : arguments) {
            double radix = Math.sqrt(arg);

            // Check the return value before using it!
            if (Double.isNaN(radix)) {
                System.out.println("Can't calculate the square root of " + arg);
            } else {
                System.out.println("Square root of " + arg + " is " + radix);
            }
        }
    }
}

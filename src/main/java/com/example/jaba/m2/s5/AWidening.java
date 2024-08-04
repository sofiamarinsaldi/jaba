/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s5;

/**
 * Widening primitives - explicit cast _is not_ required
 */
public class AWidening {
    /**
     * Widening from a byte up to a double (and char examples)
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Primitive cast is only for numeric types: Cannot cast from byte to boolean
        // boolean flag = true;
        // byte number = (byte) flag;

        byte aByte = 70;
        short aShort = aByte;
        int anInt = aShort;
        long aLong = anInt;
        float aFloat = aLong;
        double aDouble = aFloat;

        System.out.println(aDouble);

        // the character 'F' is coded as 70
        char aChar = (char) aShort;
        int anotherInt = aChar;

        // notice the difference between print() and println()
        System.out.print(aChar);
        System.out.print(" <-> ");
        System.out.println(anotherInt);

        // the character '*' is coded as 42
        char asterisk = '*';
        int asterAsInt = asterisk;
        System.out.print(asterisk);
        System.out.print(" <-> ");
        System.out.println(asterAsInt);
    }
}

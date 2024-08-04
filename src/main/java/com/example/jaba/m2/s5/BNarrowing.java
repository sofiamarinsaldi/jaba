/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s5;

/**
 * Narrowing primitives - explicit cast _is_ required
 */
public class BNarrowing {
    /**
     * Narrowing from a double down to a byte (plus cast from char to short)
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // [1 sign][11 exponent][52 mantissa]
        double aDouble = 42.0;
        // [1 sign][8 exponent][23 mantissa]
        float aFloat = (float) aDouble;

        /*-
         * 8 bytes, we could think of it like if it is stored in memory in this way:
         * [0000 0000][0000 0000][0000 0000][0000 0000]
         * [0000 0000][0000 0000][0000 0000][0010 1010]
         */
        long aLong = (long) aFloat;

        // 4 bytes: [0000 0000][0000 0000][0000 0000][0010 1010]
        int anInt = (int) aLong;

        // 2 bytes: [0000 0000][0010 1010]
        short aShort = (short) anInt;

        // 1 byte: [00101010]
        byte aByte = (byte) aShort;

        // Primitive cast is only for numeric types: Cannot cast from byte to boolean
        // boolean flag = (boolean) aByte;

        System.out.println(aByte);

        // 2 bytes: [0000 0000][0010 1010]
        char aChar = (char) anInt;

        // the cast is required: from unsigned to signed 2-bytes block of memory
        short anotherShort = (short) aChar;

        // notice the difference between print() and println()
        System.out.print(aChar);
        System.out.print(" <-> ");
        System.out.println(anotherShort);
    }
}

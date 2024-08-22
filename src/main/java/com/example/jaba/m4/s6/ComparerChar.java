/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s6;

/**
 * Comparison operators on char
 */
public class ComparerChar {
    /**
     * Some details on comparing characters
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // letters are coded in the expected order
        System.out.print("Is 'c' < 'k'? ");
        System.out.println('c' < 'k'); // true

        // all uppercase letters are before all lowercase letters
        System.out.print("Is 'Z' < 'a'? ");
        System.out.println('Z' < 'a'); // true

        // ciphers are coded in the expected order
        System.out.print("Is '0' < '9'? ");
        System.out.println('0' < '9'); // true

        // ciphers are before letters
        System.out.print("Is '0' (zero) < 'O' (upper 'o')? ");
        System.out.println('0' < 'O'); // true

        // beware of characters that look similar!
        System.out.print("Is 'ì' == 'i': ");
        System.out.println('ì' == 'i'); // false
    }
}

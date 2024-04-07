/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s2;

/**
 * Primitive and reference types
 */
public class Types {
    /**
     * Define primitive and reference variables, and print them
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // A primitive variable and a reference one
        int aPrimitive = 42;
        String aReference = "42";

        System.out.println(aReference);
        System.out.println(aPrimitive);

        // Java 10 inferred type

        // "var" is interpreted by the compiler as "int"
        var anotherPrimitive = 12;
        // "var" is interpreted by the compiler as "String"
        var anotherReference = "Tom";

        System.out.println(anotherReference);
        System.out.println(anotherPrimitive);
    }
}

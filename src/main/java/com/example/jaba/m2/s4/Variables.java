/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s4;

/**
 * Variables
 */
public class Variables {
    /**
     * Define a few variables, primitive and reference, and print them
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // A primitive variable and a reference one
        int aPrimitiveVariable = 42;
        String aReferenceVariable = "42";

        System.out.println(aReferenceVariable);
        System.out.println(aPrimitiveVariable);

        // Dangerous! Beware of null!
        String noReference = null;
        System.out.println(noReference);

        // Java 10 inferred type
        var anotherPrimitiveVariable = 12;
        var anotherReferenceVariable = "Tom";

        System.out.println(anotherReferenceVariable);
        System.out.println(anotherPrimitiveVariable);
    }
}

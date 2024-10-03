package com.example.jaba.m6.s7;

/** 
 * Given two values print the smallest and the largest
 * use Math.max() and Math.min()
 */

public class MaxMin {
public static void main(String[] args) {
	int x = 42;
	System.out.println("x is " + x);
	int y = 53;
	System.out.println("y is " + y);
	
	//TODO: put in max the largest between x and y
	int max = Math.max(x, y);
	System.out.println("Max is " + max);
	
	//TODO: put in min the smallest between x and y
	int min = Math.min(x, y);
	System.out.println("Min is " + min);
}
}

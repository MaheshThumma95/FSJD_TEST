package com.test.demo;

import java.util.Scanner;

// Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.

public class NumberCheck {

	public static void main(String[] args) {
		// Write a Java program to check whether a given number is positive,
		// negative, or zero using an if-else statement.

		System.out.print("Enter any number ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println("The number is positive.");
		} else if (num < 0) {
			System.out.println("The number is negative.");
		} else {
			System.out.println("The number is zero.");
		}
	    scanner.close();

	}

}

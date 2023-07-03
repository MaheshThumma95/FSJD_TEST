package com.test.demo;

import java.util.Scanner;

//Write a Java program to print the Fibonacci series up to a given number using a for loop.

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms you want? ");
        long numTerms = scanner.nextLong();

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.print("Fibonacci Series up to " + numTerms + " terms: ");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (long i = 3; i <= numTerms; i++) {
        	long nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}

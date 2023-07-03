package com.test.demo;

import java.util.Scanner;

//Write a Java program to calculate the average of a list of numbers using a do-while loop.
public class AvgCalculator {

	public static void main(String[] args) {

		int i = 0;
		float sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scanner.nextInt();
		float arr[] = new float[n];
		System.out.println("Enter " + n + " array elements: ");
		do {
			arr[i] = scanner.nextInt();
			sum = sum + arr[i];
			i++;
		}while (i < n);
		float average = sum / n;
		System.out.println("Average of given numbers is : " + average);

		scanner.close();
	}
}
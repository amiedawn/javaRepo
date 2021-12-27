package com.training.mars;

import java.util.Scanner;

public class SumDigit {
	public static void main(String args[]) {
		// Prompt user to enter a 4-digit number and display sum of all the digits
		// If user enters other than 4 digits, an error message should be displayed:
		// "Only 4 digit number allowed"

		// Read or initialize an integer N.
		// Declare a variable (sum) to store the sum of numbers and initialize it to 0.
		int number = 0, sum = 0, remainder = 0; // remainder === count
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a 4-digit number: ");
		number = sc.nextInt();
		
		// find number of digits in the number
		int numOfDigits = String.valueOf(number).length();

		while (number > 0) {
			// find remainder using modulo (%) operator (last digit of the number)
			remainder = number % 10;

			// add the remainder to the variable sum
			sum = sum + remainder;

			// divide the number by 10 to remove the last digit of the number
			number = number / 10;
		}
		
		// display error message if numOfDigits != 4
		System.out.println(numOfDigits);
		
		if (numOfDigits == 4) {
			// print the result
			System.out.println("The sum of the 4 digits is " + sum);
		} else {
		// if user enters other than 4 digits, display error message
		System.out.print("Only 4 digit numbers are allowed.");
		}		
	}
}

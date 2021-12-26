package com.training.mars;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// ask a user to input a number
		// store your lucky number
		//display how many attempts user took to guess your lucky number

		System.out.println("You will be entering a number to see if it matches what I am thinking of.");
		final int LUCKY_NUMBER = 4;
		int count = 0;
			
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Your guess: ");
			int number = sc.nextInt();
			count++;
			if (number == LUCKY_NUMBER) {
				System.out.println("Congrats! You guessed the lucky number! It took you " + count + " time(s).");
				break;
			}
			else {
				System.out.println("Enter another number!");
				
			}
			
		
		
		}
	}
}
		
		// while infinite loop to find a number start
//		while (true) {
//			System.out.println("Inside an infinite loop");
//			if(number>10) {
//				
//				break;
//			}
//			number++;
//		}
		// while infinite loop to find a numer end	
package com.training.mars;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); // use this if you want a prompt for the user; otherwise, won't know to
												// enter it
		int number = sc.nextInt(); // you are expected to enter a number in console and it will be saved to number
									// variable
		
		
		// while infinite loop to find a number start
//		while (true) {
//			System.out.println("Inside an infinite loop");
//			if(number>10) {
//				
//				break;
//			}
//			number++;
//		}
		// while infinite loop to find a number end		
		
		
//		while loop start
//		int i=1; // initializer
//		while (i <= 10) {
//			System.out.println(number + "*" +i+"="+number*i);
//			i++;
//		}
//		while loop end		
		
//		for loop start
//		for (int i=1; i<=10; i++) {
//			System.out.println(number + "*" +i+"="+number*i);
//		}
//		for loop end
		
		
		
//		if, else statement start
//		if (number %2 == 0) {
//			System.out.println("You have entered an even number.");
//		}
//		else {
//			System.out.println("You have entered an odd number.");
//		}
//		
//		System.out.println("The number you entered is: " + number); // display the number in console 
//		}

//}
//		if, else statement start
		class A {
			public void show() {
				System.out.println("inside new method");
			}
		}
	}
}
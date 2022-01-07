package com.training.mars;
import java.util.Scanner;

public class AbstractDemo {

	public static void main(String[] args) {
		Account sa = new Account("Mary", "s123456", 345.52); 
		Account ca = new Account("Aaron", "c654321", 234.09);
		
		// show menu
	//	void showMenu() {
			char option='\0';
			Scanner scan = new Scanner(System.in);
			
					
			System.out.println("What kind of an account would you like to open?");
			System.out.println("A. Create a savings account");
			System.out.println("B. Create a checking account");
			System.out.println("C. Exit");
			
			do {
				System.out.println("**************************");
				System.out.print("Please enter an option: ");
				option = scan.next().charAt(0);
				System.out.println("\n");
				
				switch(option) {
				
				case 'A':
				case 'a':
					// create a savings account object
					//Account sa = new SavingsAccount(); 
					System.out.println("Savings account balance: $" + sa.showBalance());
					
//					System.out.println("===========================");
//					System.out.println("Balance: " + balance);
//					System.out.println("===========================");
//					System.out.println("\n");
					break;
					
				case 'B':
				case 'b':
					// create checking account object
					//Account ca = new CheckingAccount();
					System.out.println("Checking account balance: $" + ca.showBalance());
					
//					System.out.println("===========================");
//					System.out.println("Balance: " + balance);
//					System.out.println("===========================");
//					System.out.println("\n");
					break;
					
//				case 'C':
//					System.out.println("===========================");
//					System.out.println("Enter an amount to deposit: ");
//					System.out.println("===========================");
//					double amount = scan.nextDouble();
//					deposit(amount);
//					System.out.println("\n");
//					break;
//					
//				case 'D':
//					System.out.println("===========================");
//					System.out.println("Enter an amount to withdraw: ");
//					System.out.println("===========================");
//					double amount2 = scan.nextDouble();
//					deposit(amount2);
//					System.out.println("\n");
//					break;	
//					
				case 'E':
				case 'e':
					break;
				default:
					System.out.println("You have not chosen a valid option. Please try again!");
					break;
				}
			} while(option != 'E' && option != 'e');
			
			System.out.println("Thank you for using our app! Have a lovely day!");
		}
	}

//}

package com.training.mars;

import java.util.Scanner;
// do not put a main method here; main is in abstract demo

public abstract class Account {
	String name;
	long acctNo;
	double balance;
	double previousTransaction;
	
	Account(String cName, long aNum) {
		name = cName;
		acctNo = aNum;
	}
	
	// deposit
	void deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	// withdrawal
	void withdrawal(double amount) {
		if(amount > 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	// get previous transaction
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: $" + previousTransaction);
		} else if(previousTransaction < 0) {
			// give absolute value so that we have a positive number
			System.out.println("Withdrawn: $" + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}
	
	// show menu
	void showMenu() {
		char option='\0';
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Welcome " + name);
		System.out.println("Your account number is " + acctNo);
		System.out.println("\n");
		System.out.println("What kind of an account would you like to open?");
		System.out.println("A. Create a savings account");
		System.out.println("B. Create a checking account");
		System.out.println("C. Exit");
		
		do {
			System.out.println("**************************");
			System.out.println("Please enter an option");
			System.out.println("**************************");
			option = scan.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("===========================");
				System.out.println("Balance: " + balance);
				System.out.println("===========================");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("===========================");
				System.out.println("Balance: " + balance);
				System.out.println("===========================");
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("===========================");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("===========================");
				double amount = scan.nextDouble();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("===========================");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("===========================");
				double amount2 = scan.nextDouble();
				deposit(amount2);
				System.out.println("\n");
				break;	
				
			default:
				System.out.println("You have not chosen a valid option. Please try again!");
				break;
			}
		} while(option != 'E');
		
		System.out.println("Thank you for using our app! Have a lovely day!");
		
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double showBalance();

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int showBal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

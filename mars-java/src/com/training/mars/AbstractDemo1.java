package com.training.mars;

import java.util.Scanner;

public class AbstractDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// create array of accounts
		Account1 accounts[] = new Account1[10];
		int numAccounts = 0;
		int choice;
		
		do {
			choice = menu(scan);
			System.out.println();
			
			if (choice == 1) {
				accounts[numAccounts++] = createAccount(scan);
			} else if (choice == 2) {
				doDeposit(accounts, numAccounts, scan);
			} else if (choice == 3) {
				doWithdraw(accounts, numAccounts, scan);
			} else {
				System.out.println("Thank you for using our banking app today! Goodbye!");
			}
			System.out.println();
			
		} while (choice != 4);
	}
	
	// account choice
	public static int accountMenu(Scanner scan) {
		System.out.println("Select Account Type: ");
		System.out.println("1. Checking Account");
		System.out.println("2. Savings Account");
		
		int choice; 
		do {
			System.out.println("Enter choice: ");
			choice = scan.nextInt();
		} while (choice < 1  || choice > 2);
		
		return choice;
	}
	
	public static int searchAccount(Account1 accounts [], int count, int accountNumber, String name) {
		for (int i=0; i<count; i++) {
			if (accounts[i].getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return -1;
	}
	
	// perform deposit on selected account
	public static void doDeposit(Account1[] accounts, int count, Scanner scan) {
		// get account number
		System.out.println("\nPlease enter account number: ");
		int accountNumber = scan.nextInt();
		
		// get name
				System.out.println("\nPlease enter name: ");
				String name = scan.next();
		
		// search for account
		int index = searchAccount(accounts, count, accountNumber, name);
		
		// if account is found
		if (index>=0) {
			// amount
			System.out.print("Please enter amount to deposit: $");
			double amount = scan.nextDouble();
			
			accounts[index].deposit(amount);
		} else {
			System.out.println("No account exists for account number " + accountNumber);
		}
		
	}
	
	// perform withdrawal on selected account
	public static void doWithdraw(Account1[] accounts, int count, Scanner scan) {
		// get account number
		System.out.println("\nPlease enter account number: ");
		int accountNumber = scan.nextInt();
		
		// get name
				System.out.println("\nPlease enter name: ");
				String name = scan.next();
		
		// search for account
		int index = searchAccount(accounts, count, accountNumber, name);
		
		// if account is found
		if (index>=0) {
			// amount
			System.out.print("Please enter amount to withdraw: $");
			double amount = scan.nextDouble();
			
			accounts[index].withdraw(amount);
		} else {
			System.out.println("No account exists for account number " + accountNumber);
		}
	}
		
	// create new account
	public static Account1 createAccount(Scanner scan) {
		Account1 account = null;
		int choice = accountMenu(scan);
		int accountNumber;
		String name = "";
		System.out.println("Enter account number: ");
		accountNumber = scan.nextInt();
		System.out.println("Enter name: ");
		name = scan.next();
		
		// choice is checking
		if (choice == 1) {
			account = new CheckingAccount1(accountNumber, name);
			System.out.println("Congratulations, " + name + "! Your checking account is open.");
		} else {
			// choice is savings
			account = new SavingsAccount1(accountNumber, name);
			System.out.println("Congratulations, " + name + "! Your savings account is open.");
		}
		
		return account;
	}		
	
	// menu
	public static int menu(Scanner scan) {
		System.out.println("Bank Account Menu");
		System.out.println("1. Choose Account Type to Open");
		System.out.println("2. Deposit Funds");
		System.out.println("3. Withdraw Funds");
		System.out.println("4. Quit");
		
		int choice;
		
		do {
			System.out.println("Enter choice: ");
			choice = scan.nextInt();
		} while(choice < 1 || choice > 4);
		
		return choice;
		
	}
}

package com.training.mars;

public class SavingsAccount1 extends Account1 {
	// default constructor
	public SavingsAccount1() {
		super();
	}
	
	// parameter constructor
	public SavingsAccount1 (int accountNumber, String name) {
		super(accountNumber, name);				
	}
	
	// deposit
		public void deposit(double amount) {
			// first check amount
			if (amount>0) {
				balance += amount;
				System.out.printf("Amount deposited: $%.2f%n", amount);
				System.out.printf(" Your savings account balance = $%.2f%n", balance);
			} else {
				System.out.println("You may not deposit a negative amount.");
			}
		}
		
		// withdraw
		public void withdraw(double amount) {
			if (amount > 0) {
				// check insufficient balance
				if (amount <= balance) {
					balance -= amount;
					System.out.printf("Amount withdrawn: $%.2f%n", amount);
					System.out.printf(" Your savings account balance is $%.2f%n", balance);
				} else {
					System.out.println("You do not have sufficient funds for this withdrawal.");
					}
			}
		}
	
}

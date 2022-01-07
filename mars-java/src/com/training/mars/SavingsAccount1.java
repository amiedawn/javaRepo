package com.training.mars;

public class SavingsAccount1 extends Account1 {
	// default constructor
	public SavingsAccount1() {
		super();
	}
	
	// parameter constructor
	public SavingsAccount1 (int accountNumber) {
		super(accountNumber);				
	}
	
	// deposit
		public void deposit(double amount) {
			// first check amount
			if (amount>0) {
				balance += amount;
				System.out.printf("Amount deposited: $ " + amount);
				System.out.printf("Your savings account balance = $ " + balance);
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
					System.out.printf("Amount withdrawn: $ " + amount);
					System.out.printf("Your savings account balance = $ " + balance);
				}
			} else {
				System.out.println("A negative amount may not be withdrawn");
			}
		}
	
}

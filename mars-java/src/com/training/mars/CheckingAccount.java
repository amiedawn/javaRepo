package com.training.mars;

public class CheckingAccount extends Account {

	// default constructor
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int accountNumber) {
		super(accountNumber);
		
	}
	
	// deposit
		public void deposit(double amount) {
			// check amount
			if (amount>0) {
				
			} else {
				System.out.println("You may not deposit a negative amount.");
			}
		}
		
		// withdraw
		public void withdraw(double amount) {
			
		}
	
	@Override
	public double showBalance() {
		
		return 15000;
	}



}

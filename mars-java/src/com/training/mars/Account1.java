package com.training.mars;

public abstract class Account1 {

	private int accountNumber;
	protected double balance;
	
	// default constructor
	public Account1() {
		
	}
	
	public Account1 (int accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0;
	}
	
	// getter methods
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	// deposit
	public abstract void deposit(double amount);
	
	// withdraw
	public abstract void withdraw(double amount);	
	
}

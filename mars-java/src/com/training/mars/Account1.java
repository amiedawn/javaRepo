package com.training.mars;

public abstract class Account1 {

	private int accountNumber;
	private String name;
	protected double balance;
	
	// default constructor
	public Account1() {
		
	}
	
	public Account1 (int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		balance = 0;
	}
	
	// getter methods
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	// deposit
	public abstract void deposit(double amount);
	
	// withdraw
	public abstract void withdraw(double amount);	
	
}

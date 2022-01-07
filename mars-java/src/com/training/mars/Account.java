package com.training.mars;

import java.util.Scanner;
// do not put a main method here; main is in abstract demo

public abstract class Account {
	String name;
	long acctNo;
	double balance;
	double previousTransaction;
	
	public Account(String aName, long aNum, double aBalance) {
		super();
		this.name = aName;
		this.acctNo = aNum;
		this.balance = aBalance;
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



	public int getAccountNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

package com.training.mars;

public class AbstractDemo {

	public static void main(String[] args) {
		// create a savings account object
		Account sa = new SavingsAccount(); 
		System.out.println("Savings account balance: $" + sa.showBalance());
		
		// create checking account object
		Account ca = new CheckingAccount();
		System.out.println("Checking account balance: $" + ca.showBalance());
	}

}

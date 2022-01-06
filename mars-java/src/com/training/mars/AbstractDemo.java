package com.training.mars;

public class AbstractDemo {

	public static void main(String[] args) {
		Account sa = new SavingsAccount();
		System.out.println(sa.showBalance());
		Account ca = new CheckingAccount();
		System.out.println(ca.showBalance());
	}

}

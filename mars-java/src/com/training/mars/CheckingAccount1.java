package com.training.mars;

public class CheckingAccount1 extends Account1 {
		// default constructor
		public CheckingAccount1() {
			super();
		}
		
		// parameter constructor
		public CheckingAccount1 (int accountNumber, String name) {
			super(accountNumber, name);
			
		}
		
		// deposit
			public void deposit(double amount) {
				// check amount
				if (amount>0) {
					balance += amount;
					System.out.printf("Amount deposited: $ " + amount);
					System.out.printf("Your checking account balance = $ " + balance);
				} else {
					System.out.println("You may not deposit a negative amount");
				}
			}
			
			// withdraw
			public void withdraw(double amount) {
				if (amount > 0) {
					// check insufficient balance
					if (amount <= balance) {
						balance -= amount;
						System.out.printf("Amount withdrawn: $ " + amount);
						System.out.printf("Your checking account balance = $ " + balance);
					}
				} else {
					System.out.println("A negative amount may not be withdrawn");
				}
			}
}

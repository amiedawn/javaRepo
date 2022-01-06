package com.training.mars;

public class SavingsAccount extends Account implements Payment {
	@Override
	public double showBalance() {
		
		return 8000;
	}

	@Override
	public void calculatePayment() {
		System.out.println("Logic for payment calculation");
		
	}
	
	@Override
	public int showBal() {
		return 7000;
	}
}

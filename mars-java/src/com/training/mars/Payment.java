package com.training.mars;

public interface Payment {

	// deposit (keep here in Account)
		void deposit(double amount) {
			if(amount > 0) {
				balance = balance + amount;
				previousTransaction = amount;
			}
		}
		
		// withdrawal (keep here in Account)
		void withdrawal(double amount) {
			if(amount > 0) {
				balance = balance - amount;
				previousTransaction = -amount;
			}
		}
	
	void calculatePayment();
}


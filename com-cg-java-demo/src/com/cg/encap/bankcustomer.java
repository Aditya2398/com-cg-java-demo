package com.cg.encap;

public class bankcustomer {
	  double balance;
	double checkbalance() {
		return balance;
	}
	double withdraw(double amount) {
		balance -= amount;
		return balance;
	}
	double deposit(double amount) {
		balance += amount;
		return balance;
	}
}

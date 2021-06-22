package Bankingapplication;

public abstract class Account {
private int accountnumber;
private double balance ;


public int getAccountnumber() {
	return this.accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}



public abstract void deposit(double amount);

public abstract void withdraw (double amount);
}

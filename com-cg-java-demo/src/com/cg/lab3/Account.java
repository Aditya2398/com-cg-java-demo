package com.cg.lab3;

public class Account extends Person {
private long accntno;
public long getAccntno() {
	return accntno;
}
public void setAccntno(long accntno) {
	this.accntno = accntno;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccholder() {
	return accholder;
}
public void setAccholder(Person accholder) {
	this.accholder = accholder;
}
private double balance;
Person accholder;

void deposit(double x){
	this.balance +=  x;
}
void withdraw (double y) {
		this.balance -=  y;
}
/*
public void setName(String string) {
	this.setName(string);
	
}
public void setAge(int i) {
	this.setAge(i);
	
}
public void getName() {
	this.getName();
	
}*/
}

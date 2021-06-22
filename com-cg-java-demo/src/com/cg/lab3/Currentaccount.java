package com.cg.lab3;

public class Currentaccount extends Account{
 double overdraftlimit;

@Override
void withdraw(double y) {
	if (this.getBalance()-y > 27) {
	super.withdraw(y);
	}
	else {
		System.out.println("soorry");
	}
	
	
}
 
}

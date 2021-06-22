package com.cg.demo.oop;

public class Bankcustomer {

	static int ifsc;
	int acountno;
	String name;
	double balance;
	void checkbalance() {
		System.out.println("check balance");
		
	}
	static void openaccount( ) {
		System.out.println("open an account");
	}
	
	public static void main(String[] args) {
		
		Bankcustomer c1 = new Bankcustomer();
		c1.acountno = 101;
		c1.name = "aditya";
		c1.balance = 1000;
		System.out.println(c1.acountno + "");
		c1.checkbalance();
		openaccount();
		System.out.println(ifsc);
		System.out.println(c1.ifsc);
	}
}

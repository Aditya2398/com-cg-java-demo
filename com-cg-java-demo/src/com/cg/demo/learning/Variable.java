package com.cg.demo.learning;


      

public class Variable {
	int ifsc;
	String accountholder;
	float savings;
	static void openaccount() {
		System.out.println("Aditya kamath");
	}
	void checkbalance() {
		System.out.println("Rekha Kamath");
	}
	 
	public static void main(String[] args) {
		Variable c1 = new Variable();
		c1.ifsc = 289;
		c1.accountholder = "aditya";
		System.out.println(c1.ifsc + "" + c1.accountholder + "");
		openaccount();
		c1.checkbalance();
	}

}

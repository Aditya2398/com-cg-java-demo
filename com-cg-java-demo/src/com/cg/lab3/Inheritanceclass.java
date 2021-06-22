package com.cg.lab3;


public class Inheritanceclass {
public static void main(String[] args) {
	Account Aditya = new Account();
	Aditya.setBalance(10000);
	System.out.println(Aditya.getBalance());
	Aditya.withdraw(50000000);
	System.out.println(Aditya.getBalance());
	Aditya.withdraw(10000);
	Aditya.setAge(45);
	Aditya.setName("Smith");
	System.out.println(Aditya.getName());
	System.out.println(Aditya.getAge());
	Account Adity = new Account();
	Adity.setName("kATHY");
	System.out.println(Adity.getName());
	
} 
}

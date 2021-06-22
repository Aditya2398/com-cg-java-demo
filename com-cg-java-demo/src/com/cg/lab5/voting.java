package com.cg.lab5;

import java.util.Scanner;

class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  System.out.println(str);
	 }
	}
public class voting {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the age of candidate");
		 int age = sc.nextInt();
		 sc.close();
		 
		 try {
			 if (age <=18)
				 throw new AgeException("invalid age");
			 else 
				 System.out.println("valid age");
		 }
		 catch (AgeException e) {
			 System.out.println("not above 18 reasom ;" + e);
		 }
	}

}

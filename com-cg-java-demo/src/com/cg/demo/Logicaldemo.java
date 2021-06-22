package com.cg.demo;

public class Logicaldemo {
	
	public static void main(String[] args) {
		int oralmarks = 20;
		int theorymarks  = 21;
		int expectedoralmarks = 15;
		int expectedtheorymarks = 25;
 
		System.out.println((oralmarks >= expectedoralmarks) && (theorymarks >= expectedtheorymarks));
		System.out.println((oralmarks >= expectedoralmarks) || (theorymarks >= expectedtheorymarks));
	}
	
}	
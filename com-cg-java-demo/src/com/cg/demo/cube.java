package com.cg.demo;

import java.util.Scanner;

public class cube {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter any number");
		    int num = scanner.nextInt();
			scanner.close();	
			System.out.println("cube of given number is "+(num*num*num));
	
	}
  
}

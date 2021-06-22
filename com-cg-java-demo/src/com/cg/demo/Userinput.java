package com.cg.demo;
import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		System.out.println("taking the input");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("the sum of these numbers is");
		System.out.println(c);
		
	}

}
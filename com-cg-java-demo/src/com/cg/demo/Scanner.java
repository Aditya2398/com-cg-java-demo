package com.cg.demo;

import java.util.Scanner;
public class Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int a = sc.nextInt();
		System.out.println("enter number 2");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("the sum of the numbers is" + c );
	}

	public int nextLine() {
		// TODO Auto-generated method stub
		return 0;
	}
}

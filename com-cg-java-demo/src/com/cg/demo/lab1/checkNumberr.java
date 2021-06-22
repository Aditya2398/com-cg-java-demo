package com.cg.demo.lab1;

import java.util.Scanner;

public class checkNumberr {
	

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		i = sc.nextInt();
		if(answer(i))
		{
			System.out.println("yes");
		}
		else {
			System.out.println("nope");
		}
	}

	 static boolean answer(int i)
	{
		if(i==0) {
			return false;
		}
		else if(i==1) {
			return false;
		}
		else if(i%2==0) {
			return true;
		}
		else {
			return false;
		}
			
	}
}

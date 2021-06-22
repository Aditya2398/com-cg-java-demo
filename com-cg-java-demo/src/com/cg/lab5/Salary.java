package com.cg.lab5;

import java.util.Scanner;
// doubt of this section
class Employeexception extends Exception{
	
		public Employeexception(String str) {
			  System.out.println(str);
			 }
}
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of employee");
		int Salary = sc.nextInt();
		sc.close();
		
		try {
			if (Salary<3000)
				throw new Employeexception("Salary is less than 3000");
				else 
					System.out.println("falls under category 2");
		}
		catch (Employeexception e)
		{
			System.out.println("");
			System.out.println( " falls under category 1");
		}
	}

}

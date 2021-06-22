package com.cg.demo.lab1;

import java.util.Scanner;

public class calculateDifference {
public static void main(String[] args) {
	
	int n, sum1=0, sum2=0,sum3=0, diff=0; 
	System.out.println("enter total natural nos");
	Scanner x = new Scanner(System.in);
	n = x.nextInt();
	
	for(int i=1; i<=n; i++) {
		sum1 =sum1+  i*i;
	}
	for(int i=1; i<=n;i++) {
		sum2= sum2 + i;
	}
	 sum3 = sum2*sum2;		
	calculate(sum1,sum3);
}
public static void calculate(int y ,int x)
{
	int z = x - y;
	
	System.out.println(z);
}
}

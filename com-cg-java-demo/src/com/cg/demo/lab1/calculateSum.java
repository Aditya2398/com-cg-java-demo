package com.cg.demo.lab1;

import java.util.*;

public  class calculateSum {
	
	public static void main(String[] args) {
		
	int n, sum=0,i=0;
	Scanner sc = new Scanner(System.in);
	//entering the number of elements
	System.out.println("enter the number of elements");
	n = sc.nextInt();
	
	
	//8664
	// enter array elements
	
	while(i<=n) {
      if((i%3==0) || (i%5==0))
    {
	sum+=i;
   }
	i++;
	}
	System.out.println(sum);

	}
	
}

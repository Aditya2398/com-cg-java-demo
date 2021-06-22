package com.cg.demo.lab2;


import java.util.*;
main

public class getSecondhighestnumber {
public static void main(String[] args) {
	
	int n, temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	n = sc.nextInt();
	int[] array = new int[n];
//	int[] array1=new int[n];
	System.out.println("enter the elements");
	for (int i=0; i<n; i++) {
		array[i]=sc.nextInt();
		
	}
	
	int array1 =Arrays.sort(array);
	for (int i=0; i<n; i++) {
		System.out.println(array1[i]);
		
	}
	
/*	for(int i=0; i<n; i++) {
		for(int j = i+1;j<n;j++) {
			 if (array[i]>array[j]) {
				 temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
			 }
		}
	
	}*/
	System.out.println("the second smallest number is" + array[1]);
}
}
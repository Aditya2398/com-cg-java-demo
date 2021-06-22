package com.cg.demo.lab2;

import java.util.Scanner;

public class getSorted {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of elements");
	int n =sc.nextInt();
    int [] array1 = new int[n];
    for (int i =0;i<n; i++) {
    System.out.println( "enter array elements" + (i+1));
    array1[i]=sc.nextInt();
}
    System.out.println("orignal order is" + "");
    for (int i =0; i<n;i++) {
        System.out.print( array1[i] +" ");
    }
    System.out.println();
    
    System.out.println("reverse order is" + "");
    for (int i =n-1; i>0;i--) {
        System.out.print( array1[i] +" ");
    }
    
}
}



 
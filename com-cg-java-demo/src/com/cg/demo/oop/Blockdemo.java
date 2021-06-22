package com.cg.demo.oop;

public class Blockdemo {
	static int num = 10;
	static {
		System.out.println("aaaaaaa");
	}
	{
		System.out.println("bbbbbb");
	}
	 
	static void n1() {
		System.out.println("n1");
	
	}
	public static void main(String[] args) {
		
		System.out.println("main");
		n1();
		System.out.println(num);
	}

}

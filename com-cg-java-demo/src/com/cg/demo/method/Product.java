package com.cg.demo.method;

public class Product {
 // four fields 
	int designation;
	String name;
	double cost;
	double expirydate;
	
	
	

	public Product(int designation, String name) {
		super();
		this.designation = designation;
		this.name = name;
	}


	public Product(int designation, String name, double cost, double expirydate) {
		super();
		this.designation = designation;
		this.name = name;
		this.cost = cost;
		this.expirydate = expirydate;
	}


	@Override
	public String toString() {
		return "Product [designation=" + designation + ", name=" + name + ", cost=" + cost + ", expirydate="
				+ expirydate + "]";
	}


	
	
}
	
//	Product(){
//		System.out.println("this is information of first product");
//	}
//	
//	Product(int designation, String name, double cost, double expirydate){
//		this.designation = designation;
//		this.name = name;
//		this.cost = cost;
//		this.expirydate = expirydate;
//		System.out.println("This is the information of second product");
//	}
//	public String toString() {
//		return "Product[designation=" + designation + ", name=" + name + ", cost=" + cost + "]";
//		
//	}
//	
//	
//}

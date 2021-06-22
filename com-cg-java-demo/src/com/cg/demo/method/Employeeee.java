package com.cg.demo.method;

public class Employeeee {
	 public static void main(String[] args) {

		 

	        int num = 10;

	  

	        Employee obj = new Employee();
	        obj.id = 101;
	        obj.name = "Abc";
	        obj.salary = 10.5;
	        System.out.println(obj.toString());
	        
	        Employee obj1 = new Employee(104, "ddd", 45.85);
	        System.out.println(obj1.toString());
	        
	        Employee obj2 = new Employee(105, "ddd");
	        System.out.println(obj2.toString());

	 

	    }

}

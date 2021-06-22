package col.demo.java;

import java.util.*;

public class Arraylist {
	public static void main(String[] args) {

//		int[] numArray = new int[5];
//
//		int[] arr = { 10, 20, 30, 40, 50 }; // not growable not shrinkable
////		int[] numArray = new int[5];
////
////		int[] arr = { 10, 20, 30, 40, 50 }; // not growable not shrinkable
////
////		System.out.println(arr.length);
////
		LinkedList<String>myList = new LinkedList<>();
		System.out.println(myList.size());
		myList.add("adi");
		myList.add("");
		myList.add("");
		myList.contains("adi");
		myList.addFirst("Aditya");

		myList.addLast("Rhggd");
		System.out.println(myList.size());
		System.out.println(myList.contains("Aditya"));
		
		
		
		ArrayList<Integer>myList1 = new ArrayList<>();
		System.out.println(myList1.size());
		myList1.add(78);
		myList1.add(90);
		myList1.add(76);
		System.out.println(myList1.size());
		System.out.println(myList1.contains("Aditya"));
	}
}
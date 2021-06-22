package col.demo.Problem;

import java.util.*;



public class classt {
public static void main(String[] args) {
	
Scanner sc = new Scanner (System.in);
System.out.println("enterthe value ");
String z = sc.next();
System.out.println("the length of string is " + z.length());
System.out.println("the upper case is " + z.toUpperCase());
System.out.println("the lower class is " + z.toLowerCase());
System.out.println("conditions are " + z.indexOf(z));
System.out.println("conditions are " + z.lastIndexOf("a"));
System.out.println(z.length()-1);
System.out.println(z.charAt(z.length()-1));
char ch='a';
int ciunt = 0;
for (int i=0; i < z.length();i++)
{  
	if(ch==z.charAt(i)) {
		ciunt ++;
			
}
	
	
	
}
System.out.println(ciunt);
//
//sc.close();
//int temp = z;
//int o;
//
//while(z>0){
//	
// o = z % 10;
// z = z/10;
// System.out.print(o);
// 
}
}
//sum = sum + (o*o*o);
//
//}
//if ( temp == sum) 
//	
//	System.out.println(" it is an amstrong number");
//else 
//System.out.println("it is not an amstrong number");




//System.out.println("enter the value");
//int z = sc.nextInt();
//int [] array = new int [z];
//for (int i =0; i<z; i++) {
//	array[i]=sc.nextInt();}
////	if (palindrom(array)) {
////		System.out.println("it is ");
////	}
////		else {
////			System.out.println("it is not");
////		}
////	}
//if (palindrom(array)) {
//	System.out.println("it is ");
//}
//	else {
//		System.out.println("it is not");
//	}
//}
//
//


	
//public static boolean palindrom(int[] array) {
//	int s = array.length-1;
//	for (int i = 0; i< array.length; i++)
//	{
//		if (array[s]== array[i]) {
//			return false;
//		}
//		s--;
//	}return true;
//}
//
//
//public static boolean arm(int[] array) {
//
//for (int i = 0; i< array.length; i++)
//{
//	
//}
////	char y,z;
////	boolean a,b ;
//	int z = 0;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number ");
//	z = sc.nextInt();
//	sc.close();
//	boolean flag = false;
//	for (int i =2; i <z; i++) {
//		if ( z % i == 0) {
//			flag = true;
//			break ;
//		}
//			
//	}
//	
//	if (flag)
//		System.out.println("the number is not  prime number");
//	else 
//		System.out.println("the number is  prime");
//	
//	
////	char s = sc.next().charAt(0);
////	System.out.println(s);
////	a = Character.isAlphabetic(s);
////	b = Character.isAlphabetic(s);
////	a = Character.isUpperCase(s);
////	System.out.println(a);
////	
////	
//	
////	System.out.println("enter the number ");
////	i = sc.nextFloat();
////	
////	System.out.println("the value in yard is " + i*0.076852);
////}
////}
////	
////double i ;
////Scanner sc = new Scanner(System.in);
////System.out.println("Enter the Principal amount ");
////i = sc.nextDouble();
//////int year = i/365;
//////int week = i/7;
//////int days = i%365;
//////int x = Math.
////System.out.println("enter the rate %");
////double r = sc.nextDouble();
////System.out.println("enter the no of years");
////double n = sc.nextDouble();
////double z = i*(Math.pow(1+r, n) - 1);
////sc.close();
////System.out.println(z);
////
//
////System.out.println(" years is " + year);
////System.out.println(  " week is " + week);
////System.out.println(days);
//////int z = sc.nextInt();
////sc.close();
//// 
// 
// 
//
//
//}
//}
//	
//	
//	
//
////	System.out.println("enter first number");
////	System.out.println("size is " + Integer.SIZE);
////	System.out.println("size is " + Double.SIZE);
//	System.out.println("size is " + Short.SIZE);
//	System.out.println("size is " + Long.SIZE);
//	System.out.println("size is " + Character.SIZE);
//	System.out.println("maximum is " + Integer.MAX_VALUE);
//	System.out.println("size is " + Integer.MIN_VALUE);

//	swap (a,b);
//	int quo,rem;
//	quo = a/b;
//	rem = a%b;
//	System.out.println(quo + rem);
//   char y = 'A';
//   int x = (int) y;
//   
//   System.out.println(x);


//private static void swap(int a, int b) {
//	// TODO Auto-generated method stub
//	a = a + b;
//	b = a- b;
//	a = a - b;
//	System.out.print(a);
//	System.out.print(b);
//	
//}
//}



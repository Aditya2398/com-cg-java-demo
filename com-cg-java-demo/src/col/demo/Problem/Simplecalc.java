package col.demo.Problem;

import java.util.Scanner;

public class Simplecalc {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	a=sc.nextInt();
	System.out.println("enter second number");
	b=sc.nextInt();
	System.out.println("enter your choice 1-add 2-subtract 3-multiply 4-divide");
	int ch=sc.nextInt();
	if(ch==1)
		System.out.println("addition = " + (a+b));
	else if(ch==2)
		System.out.println("subtraction = " + (a-b));
	else if(ch==3)
		System.out.println("multiply = " + (a*b));
	else if(ch==4)
		System.out.println("divide = " + (a/b));
	else 
		System.out.println("invalid choice");
	
}
}

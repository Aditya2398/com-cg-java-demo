package col.demo.Problem;

import java.util.Scanner;

public class Maxbtwntwonum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	int a = sc.nextInt();
	System.out.println("enter second number");
	int b = sc.nextInt();
	System.out.println("enter second number");
	int c = sc.nextInt();
	if (a>b && a>c)
		System.out.println("Maximum number is " + a);
	else if (b>a && b >c)
		System.out.println("Maximum number is " + b);
	else 
		System.out.println("maximum number is " + c);
	
}
}

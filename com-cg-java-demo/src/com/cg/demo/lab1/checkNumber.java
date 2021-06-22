
package com.cg.demo.lab1;
import java.util.Scanner;

public class checkNumber {
    public static void main(String args[]) {
  // create one integer variable num to store value and one boolean flag to check the conditions.
       int num;
       boolean flag = false;
  // create scanner class for taking input from user.
       Scanner scanner = new Scanner(System.in);
  // enter the number and store it as num value.
       System.out.println("Enter a number : ");
       num = scanner.nextInt();
  // Create one integer currentDigit. It will hold the rightmost digit of the number. Convert the num to num/10.
       int currentDigit = num % 10;
       num = num/10;
  //Run one while loop to check for all digits of num.
       while(num>0){
    //if any right digit is less than the left digit, mark flag as true and break from the loop.
    //Else, change the rightmost digit to the next left digit and change the number to number / 10.
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }

           currentDigit = num % 10;
           num = num/10;
       }
        
    //7Check the value of flag and print one message to the user.
       //If flag is true, digits are not in increasing order, else they are in increasing order.
       if(flag){
           System.out.println("Digits are not in increasing order.");
       }else{
           System.out.println("Digits are in increasing order.");
       }
    }
}
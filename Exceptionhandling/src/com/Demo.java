package com;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	System.out.println("Start");
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter 1st value");
	int a=scan.nextInt();
	
	System.out.println("enter 2nd value");
	int b=scan.nextInt();
	//wheneve we get excpetion we have make use of try and catch in try we have to write the particular linw where we are getting the exception
	try {
	System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println(" DabbaFellow,do not divide by 0");
	}
	
	scan.close();
	System.out.println("End");
    }

}

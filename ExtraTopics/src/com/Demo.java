package com;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter choice");
		int choice=scan.nextInt();
	
		
		while(true) {
			
			switch(choice) {
			case 1:
				System.out.println("hi");
				break;
			case 2:
				System.out.println("bye");
				break;
				
			 case 3:
				System.out.println("Thank you");
				System.exit(0);
				default:
					System.out.println("Invalid input");
			}
		}
	
		
	}

}
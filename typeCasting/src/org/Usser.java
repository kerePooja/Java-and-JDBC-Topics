package org;

import java.util.Scanner;

public class Usser {

	public static void main(String[] args) {
		
		Cafe c=new Cafe();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter choice");
		System.out.println("1.:Coffee\n2:Tea");
		int choice=s.nextInt();
	
		
	
        Beverages B=c.VendingMachine(choice);
		
		if(B instanceof Tea) {
			System.out.println("Downcasting the tea");	    
			
		}
	    else if(B instanceof Coffee) {
			System.out.println("Downcasting the coffee");
		}
	    else
		{
			System.out.println("Invalid Input");
			
		}

	}

}

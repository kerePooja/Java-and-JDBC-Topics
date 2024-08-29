package org;
import java.util.Scanner;

public class Flipkart {
	public static void main(String[] args) {
	
	TestElectronics E=new TestElectronics();
	
	
	Scanner sc=new Scanner(System.in);
    
	System.out.println("enter your chice");
	System.out.println("1.Mobile\n2.Laptop");
	int choice = sc.nextInt();
	
	
	
	
	Eloctronics e=E.ElectronincsShopping(choice);
	
	if(e instanceof Mobile) {
		//Mobile m=(Mobile) e;
		System.out.println("Buying Mobile");
		
		
	}
	else if(e instanceof Laptop) {
		//Laptop l=(Laptop) e;
		System.out.println("Buying Laptop");
		
	}
	else {
		System.out.println("invalid input");
		
	}
	
}
}
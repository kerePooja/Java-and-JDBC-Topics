package org;

public class TestCafe {

	public static void main(String[] args) {
		Cafe C=new Cafe();
		
		Beverages B=C.VendingMachine(1);
		
		if(B instanceof Tea) {
			System.out.println("Downcasting the tea");	    
			
		}
	    else if(B instanceof Coffee) {
			System.out.println("Downcasting the tea");
		}else
		{
			System.out.println("Invalid Input");
			
		}

	}

}

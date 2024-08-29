package org;

public class Cafe {
	
	Beverages VendingMachine(int choice){
		if(choice == 1) 
		{
		return new Coffee();
	     /*Tea t=new Tea();
		 return t;*/
		}
		else if (choice == 2) {
		return new Tea();
	    /* Coffee c= new Coffee();
		   return  c;*/
		}
		else 
		{
				return null;
		}
	}
	
	
	
}

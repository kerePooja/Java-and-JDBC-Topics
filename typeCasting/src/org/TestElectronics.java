package org;

public class TestElectronics {
	
	Eloctronics ElectronincsShopping(int choice){
		
		if(choice == 1) 
		{
			return new Mobile();
			
		}
		else if(choice == 2) 
		{
			return new Laptop();
			
		}
		else
		{
			return null;
		}	
	}
}

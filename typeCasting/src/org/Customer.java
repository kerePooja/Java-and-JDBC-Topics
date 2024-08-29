package org;

public class Customer {

	public static void main(String[] args) {
		Hotel h=new Hotel();
		
		Food obj=h.orderFood(1);
		
		if(obj instanceof Idly) {
			System.out.println("ordered Idly");
		}
		else if(obj instanceof Dosa) {
			System.out.println("ordered Dosa");
		}
		else {
			System.out.println("ordered Vada");
		}
			
		}
		
   
			

}

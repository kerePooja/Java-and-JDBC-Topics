package com;

public class TestYeildM {
	public static void main(String[] args) {
		YeildM  t=new YeildM();
		//t.setPriority(10);
		
		 t.start();
		
		  for(int i=0; i<10; i++) {
			  System.out.println("Main Yield Thread");
		  }

	}

}




package com;

public class Test {

	public static void main(String[] args) {
         System.out.println("start");
         
		 int[] a = {10,30,20,50,70};
		 
		 try {
		 System.out.println(a[90]);
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("invalid index");
		 }
		
		System.out.println("end");
		

	}

}

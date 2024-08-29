package com;

public class MainOverloading {

	public static void main(String[] args) {
		System.out.println("hello");
		main(10);
		main(20);
		main(12.5);
		
	}
    public static void main(int a) {
    	System.out.println("a: "+a);
    	
	}
    public static void main(double b) {
    	System.out.println("b "+b);
	}



}

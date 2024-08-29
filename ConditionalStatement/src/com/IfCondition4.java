package com;

public class IfCondition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=60;
		int c=10;
		
		if(a>0) {//number is positive or negative
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
			
		}
		System.out.println("----------------------");
		
		
		//even or odd
		if(a%2==0 || b%2==0)
		{
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
			
		}
		
		System.out.println("----------------------");
		
		
		if(a>b) {//largest of 2 numbers
			System.out.println("a is largest");
		}
		else if(a<b) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("a and b both are equal");
		}
		
		System.out.println("----------------------");
		
		

		if(a>b && a>c) { // largest of 3 numbers
			System.out.println("a is largest");
		}
		else if(b>a && b>c) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
		
		
		System.out.println("----------------------");
		
		
		if(a>b ) {
			if(a>c){
				System.out.println("a is largest");
			}
			else {
				System.out.println("c is largest");	
			}
		}
			else {
				System.out.println("b is largest");
				
			}
			
			
		}
	}



package com;

public class IfelseIfCondition3 {

	public static void main(String args[]) {
		float marks = 85;
		
		if(marks>=85 && marks<=100) {
			System.out.println(" student got Distiction with  " +marks+" marks");
		}
		 else if(marks>=60 && marks>85) {
			System.out.println(" student got Firstclass with  " +marks+" marks");
		}
		 else if(marks >=35 && marks>60) {
			 System.out.println(" student is passed 2 nd class with  " +marks+" marks");
			 
		 }
		 else {
			 System.out.println(" student is failed in exam ");
		 }		
	}
}

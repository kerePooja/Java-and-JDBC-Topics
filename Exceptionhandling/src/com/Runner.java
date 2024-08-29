package com;

public class Runner {

	public static void main(String[] args) {
	
		try {
		System.out.println(10/0);//object of arithematic excpetion
		}
		//int a=10;//we cannot have a executable code in between try and catch
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid Index");
		}
		catch(NullPointerException e) {
			System.out.println("invalid ");
		}
		catch(ArithmeticException e) {
			System.out.println("invalid Denominator");
		}
		catch(Exception e) {
			System.out.println("superclass");
		}
	}

}

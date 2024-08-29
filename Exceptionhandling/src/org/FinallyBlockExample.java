package org;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		System.out.println("start");
		try 
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Denominator");
		}
		finally
		{
			System.out.println("inside finally block");
		}
		
		System.out.println("end");
		
	}

}

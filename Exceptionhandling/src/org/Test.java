package org;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			  String message= e.getMessage();
			  System.out.println(message);
		}
		System.out.println("end");
	}

}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at Exceptionhandling/org.Demo.main(Demo.java:7)*/

/*
 * start 
 * / by zero
 *  end
 */
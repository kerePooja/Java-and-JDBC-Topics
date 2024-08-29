package checkedAndUnchecked;

public class Demo {
	static void  div() throws ArithmeticException {//in majority throws are used with checked exception 
		//even if we dont use throw then also it will run bcs of it example of is unchecked exception
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		
		System.out.println("hello start");
     
		try {
		div();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		
		    
		System.out.println(" the end");
	}

}

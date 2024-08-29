package blocks;

public class Test {
	
	//non.static block
	{
		System.out.println("Hello pooja-1");
		
	}

	public static void main(String[] args) {
		Test t=new Test();//when we create object then only non-static object is created
		
		//System.out.println()
		
	}
	{
		System.out.println("Hello pooja-2");
	}
	{
		System.out.println("Hello pooja-3");
	}
}

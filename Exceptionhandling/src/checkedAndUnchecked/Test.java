package checkedAndUnchecked;

public class Test {
	
	static void display() throws InterruptedException //we can use exception
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
		
	}
	

	public static void main(String[] args) {
		
		 try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

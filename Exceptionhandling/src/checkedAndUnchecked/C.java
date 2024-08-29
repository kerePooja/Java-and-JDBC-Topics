package checkedAndUnchecked;

public class C {

	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			System.out.println(i);
			//to pause the exicution for 2 seconds we make use of thread class and a static method called sleep
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
//example of checked exception
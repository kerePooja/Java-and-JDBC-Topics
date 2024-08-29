package singleton;

public class AdharCard {
	
	 private static AdharCard A=null;
	
	private AdharCard() {
		System.out.println("AdharCard created");
	}
	
	public  static void createObjectOfAdhar() {
		
		if (A==null)
		{
			A=new AdharCard();
		}
		else {
			System.out.println("object of adhar cannot created");
		}
		
		
	}

}

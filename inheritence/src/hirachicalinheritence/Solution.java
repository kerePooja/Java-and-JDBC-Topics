package hirachicalinheritence;

public class Solution {

	public static void main(String[] args) {
		 
		Car c=new Car();
		Bike b=new Bike();
		
		System.out.println(c.brand);
		System.out.println(c.cost);
		System.out.println("-----------");
		System.out.println(b.brand+" "+b.fuel);
		c.start();
		
		System.out.println("=============================");
		
		System.out.println(b.brand);
		System.out.println(b.fuel);
		System.out.println("-----------");
		System.out.println(b.brand+" "+b.fuel);
		
		
		b.stop();
		
		
		
		

	}

}

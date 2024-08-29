package nonPrimitivetypeCasting;

public class TestVehicle {

	public static void main(String[] args) {
		/*Upcasting*/
		Vehicle v=new Car();
		System.out.println(v.brand);//subclass properties cant access
		v.start();
		
		System.out.println("============");
		
		/*DownCasting*/
		Car c=(Car)v;
		System.out.println(c.brand);
		c.start();
		System.out.println(c.fuel);
		c.stop();
		
		
	}

}

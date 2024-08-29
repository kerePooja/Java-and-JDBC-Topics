package classCastException;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("START");
		//we can do declaration and initialization separatly
		/*Father f;
		f=new Son();*/

		Vehicle  V=new Bike(); //upcasting*/
		//To avoid CCE we use instance of
		
		if(V instanceof Car) {
			System.out.println("DownCasting the CAR ");
			Car c=(Car) V;
			 System.out.println(c.cost+" "+c.brand);
			
			
			
		}
		else if(V instanceof Bike) {
			System.out.println("DownCasting the BIKE ");
			Bike b=(Bike) V;
			 System.out.println(b.brand+" "+b.fuel);
		}
		System.out.println("End");
	}


	}



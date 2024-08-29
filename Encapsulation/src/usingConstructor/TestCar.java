package usingConstructor;
import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {
		Car c=new Car(100);
	/*it will not take so we have to create one getter class System.out.println(c.cost);
	*/
			
		 
	
		 System.out.println(c.getCost());
		 
		 c.setCost(200);
		 System.out.println(c.getCost());
		 
		 c.setCost(700);
		 System.out.println(c.getCost());
		 
	}
	

}

package blocks;

public class Car {

	static
	{
		System.out.println(1);
	}
	public static void main(String[] args) {
	 
		System.out.println(3);
		//non static method is  created during the object creation
		Car c=new Car();

	}
	{
		System.out.println(2);
	}

}

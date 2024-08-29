package methodOverriding;

public class Car extends Vehicle{
	@Override
	 
	void start() {
		super.start();
		System.out.println("you are riding car");
		super.start();
	}
    
}

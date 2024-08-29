package constructorchaining;

public class Recursive {
	
	Recursive(String name){
		this(22);
		System.out.println("enter the name"+name);
		
	}
	
	Recursive(int age){
		this("tom");
		System.out.println("enter the name"+age);
	}
	public static void main(String[] args) {
		Recursive R=new Recursive("tom");

	}

}

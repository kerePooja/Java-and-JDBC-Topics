package constructorchaining;

public class Son extends Father {
	
	Son(){
		//super(); implicitly create super class
		super(10);
		System.out.println(2);
		
	}

}

package constructorchaining;

public class Demo {
	
	Demo(int a){
		System.out.println(1);
	}
	Demo(){
		this(10);
		System.out.println(2);
	}

	public static void main(String[] args) {
		Demo d= new Demo();
		

	}

}

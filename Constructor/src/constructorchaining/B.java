package constructorchaining;

public class B extends A{
	
	B(int x){
		this();
		System.out.println(3);
	}
	B(){
		super(10);
		System.out.println(4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           B b=new B(50);
	}

}

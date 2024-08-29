package methodOverriding;

public class Son extends Father {

	@Override
	void bike() {
		System.out.println("this bike is now son's");
	}
	public static void main(String[] args) {
		Son s=new Son();
		 s.bike();

	}

}

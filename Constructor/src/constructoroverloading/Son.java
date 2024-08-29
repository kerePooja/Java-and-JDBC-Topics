package constructoroverloading;

public class Son extends Father {
	
	int age=30;
	
	void display() {
		int age=15;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
	}

}

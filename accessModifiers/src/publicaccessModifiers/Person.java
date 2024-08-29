package publicaccessModifiers;


/*Accessing public member inside same class*/

public class Person {
	public int age=25;
	
	public Person() {
		System.out.println("Im person Constructor");
	}
	
	public void walk() {
		System.out.println("person is walking");	
	}

	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println(p.age);
		p.walk();
		
	}
}

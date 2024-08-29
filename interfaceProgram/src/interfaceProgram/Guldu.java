package interfaceProgram;

public class Guldu implements Person {
	
    @Override
	public void eat() {//default have lower accessibility so we ave to use public
		System.out.println("eating");
	}
	
	
	public static void main(String[] args) {
		System.out.println(Person.id);
		
	   Guldu g=new Guldu();
	   g.eat();
			   
			
	}
  
}

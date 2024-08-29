package runtime;

public class MainClass {

	 void invokWork(Employee emp){//creating reference of super class
		emp.work();
	}
	public static void main(String[] args) {
		MainClass m=new MainClass();
		
		m.invokWork(new Tester());//creating an object of sub class
		m.invokWork(new Developer());
		System.out.println("================");
		
		Tester t=new Tester();
		m.invokWork(t);
		
		Developer d=new Developer();
		m.invokWork(d);
	}
	
}

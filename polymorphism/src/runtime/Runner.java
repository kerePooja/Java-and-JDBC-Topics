package runtime;

public class Runner {

	public static void main(String[] args) {
		
		Employee E1=new Developer();
		E1.work();
		
		System.out.println("=================");
		
        Employee E2=new Tester();
	    E2.work();
		
	    //to avoide different references we make use of declaration and initilization
		
	    
	    System.out.println("=================");
		
         Employee emp;
         emp=new Developer();
         emp.work();
         
         emp=new Tester();
         emp.work();
         
         
         
	}

}

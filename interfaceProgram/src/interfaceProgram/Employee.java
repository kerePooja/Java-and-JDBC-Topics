package interfaceProgram;

public class Employee extends TestYantra implements Jspiders,Qspiders{

	
	@Override
	public void develop() {
		System.out.println("i am developing the software");
	}
	@Override
	public void test() {
		System.out.println("i am testing the software");
	}
	
	//optionally override work()
	
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.develop();
        emp.test();
        emp.work();
	}
}

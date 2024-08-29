package comparingobjects;

public class Employee {

	int id;
	double hight;
	String name;
	
	Employee(int id,double hight,String name){
		this.id=id;
		this.hight=hight;
		this.name=name;
		}
	  @Override
	  public boolean equals(Object obj) {
		  Employee emp=(Employee)obj;
		  return this.id == emp.id && this.hight==emp.hight;
		  
	  }
	    public static void main(String[] args) {
		Employee emp1=new Employee(101,5.6,"shinoy");
		Employee emp2=new Employee(101,5.6,"shree");
		Employee emp3=new Employee(104,5.2,"pooja");
		
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp3));	
		
		System.out.println("-------------");
		System.out.println(new Employee(11,5.4,"pooja").equals(new Employee(11,5.4,"pooja")));
		System.out.println("-------------");
		if(emp1.equals(emp2)) {
			System.out.println("contents are same");
		}
		else {
			System.out.println("contents are different");
		}
		
	}
	
}

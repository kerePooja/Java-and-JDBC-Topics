package customSorting;

import java.util.TreeSet;

public class SortEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(104,"Shinoy",60000.0);
		Employee e2=new Employee(101,"pooja",86000.0);
		Employee e3=new Employee(102,"shenoy",85000.0);
		
     	//SorEmployeeById id=new SorEmployeeById();
		//SortEmployeeByName name=new SortEmployeeByName();
     	SortEmployeeBySalary salary=new SortEmployeeBySalary();
     	
		
		TreeSet<Employee> ts=new TreeSet<Employee>(salary);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(new Employee(103,"Appu",55000.0));
		ts.add(new Employee(105,"Appi",95000.0));
		
		for(Employee emp:ts) {
			System.out.println(emp);
		}
	}
}

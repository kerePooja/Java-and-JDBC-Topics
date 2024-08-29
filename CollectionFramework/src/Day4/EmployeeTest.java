package Day4;

import java.util.ArrayList;

public class EmployeeTest {
  
	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"POOJA");
		Employee e2=new Employee(102,"BITTU");
		Employee e3=new Employee(103,"SHINOY");
		//to print only employee objects we used<employee>
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		for(Employee Emp: al) {
			System.out.println(Emp);
		}
		System.out.println("=================");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}

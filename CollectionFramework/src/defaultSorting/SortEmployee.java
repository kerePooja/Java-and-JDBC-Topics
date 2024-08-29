package defaultSorting;

import java.util.TreeSet;

public class SortEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(103,"pooja",50000.0);
		Employee e2=new Employee(101,"shinoy",90000.0);
		Employee e3=new Employee(102,"appu",70000.0);
		
		
		TreeSet<Employee> t=new TreeSet<Employee>();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(new Employee(105,"bhagya",80000.0));
		t.add(new Employee(104,"shenoy",80000.0));
		
		for(Employee obj:t) {
			System.out.println(obj);
		}
		
	}

}

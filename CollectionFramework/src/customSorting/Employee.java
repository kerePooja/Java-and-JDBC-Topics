package customSorting;

public class Employee {

	int id;
	String name;
	Double salary;
	public Employee(int age, String name, double salary) {
		super();
		this.id = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary;
	}
	
	
}

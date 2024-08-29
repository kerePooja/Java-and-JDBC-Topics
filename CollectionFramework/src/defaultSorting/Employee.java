package defaultSorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" "+"name: "+name+" "+"salary: "+salary;
	}
	

	public int compareTo(Employee e) {
		return (int) (this.salary-(e.salary));
	}
	/*
	 * public int compareTo(Employee e) { return this.name.compareTo(e.name); }
	 */
	/*
	 * public int compareTo(Employee e) { return this.id-e.id; }
	 */
}
 
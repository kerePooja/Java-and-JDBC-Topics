package defaultSorting;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "ID: "+id+" "+"Name: "+name;
	}
	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);//when it is string we have to use  compareTo
	}
	
	
	
	
	/*
	 * public int comapareTo(Student s) { return this.id-s.id; }
	 */

}

package customSorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(23,"c");
		Student s2=new Student(27,"t");
		Student s3=new Student(22,"a");
		
		//SortStudentByAge age=new SortStudentByAge();
		SortStudentByName name=new SortStudentByName();
		
		TreeSet<Student> ts=new TreeSet<Student>(name);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student std:ts) {
			System.out.println(std);
		}
		
	}

}

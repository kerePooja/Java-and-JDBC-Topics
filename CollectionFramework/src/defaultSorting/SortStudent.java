package defaultSorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Student s1=new Student(103,"pooja");
		Student s2=new Student(101,"Shinoy");
		Student s3=new Student(102,"Appu");

		TreeSet<Student> ts=new TreeSet<Student>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student obj:ts) {
			System.out.println(obj);
			
		}
		
	}

}

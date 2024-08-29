package customSorting;

import java.util.Comparator;//step 2

public class SortStudentByAge implements Comparator<Student> {//step 1{

	@Override
	public int compare(Student x, Student y) {
	   return x.age-y.age;
	}//step 3

}

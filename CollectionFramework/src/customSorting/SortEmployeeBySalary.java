package customSorting;

import java.util.Comparator;//step 2


public class SortEmployeeBySalary implements Comparator<Employee> {//step 1 {
	
			@Override
			public int compare(Employee  x, Employee  y) {
				return   x.salary.compareTo(y.salary);
			 //return  (int)( x.salary-y.salary);
			}//step 3

		}


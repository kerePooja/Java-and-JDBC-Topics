package customSorting;

import java.util.Comparator;//step 2

public class SortEmployeeByName implements Comparator<Employee> {//step 1

		@Override
		public int compare(Employee  x, Employee  y) {
		   return x.name.compareTo(y.name);
		}//step 3

	}



package customSorting;

import java.util.Comparator;

public class SorEmployeeById implements Comparator<Employee>{

	
	@Override//if you want descenging order
	public int compare(Employee x, Employee y) {
		return y.id-x.id;
	}

	
	/*//Assending order
	 * @Override public int compare(Employee x, Employee y) { return x.id-y.id; }
	 */
}

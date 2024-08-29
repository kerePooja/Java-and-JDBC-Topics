package Day4;

public class Employee {
	
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}

	public String toString() {//if we do not override the tostring method then we will get fully qualified class name
		return "id:"+id+" "+"name:"+name;
	
}
	
}

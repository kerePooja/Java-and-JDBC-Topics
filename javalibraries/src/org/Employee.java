package org;

public class Employee {
	
	int id;
    String name;
      
    Employee(int id,String name){
    	  this.id=id;
    	  this.name=name;
      }
    public String toString() {
    	return "employee name is "+name+" is of "+id;
    }
    
    
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Pooja");
		Employee e2=new Employee(102,"Shinoy");
		Employee e3=new Employee(103,"Naveen");

		System.out.println(e1);
		System.out.println(e2);
	    System.out.println(e3);
		
		
	}

}

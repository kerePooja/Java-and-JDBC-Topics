package com;

public class Employe {

	int id;
	String name;
	double salary;
	
	Employe(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	 public static void main(String[] args) {
		Employe e1=new Employe(101,"pooja",25000.67);
		Employe e2=new Employe(102,"shinoy",600000.65);

	   System.out.println("Employe Details");
	   System.out.println("==============");
		
	   System.out.println("Employe Id: "+e1.id);
	   System.out.println("Employe name: "+e1.name);
	   System.out.println("Employe salary: "+e1.salary);
	   
	   System.out.println("-------");
	   
	   
	   System.out.println("Employe Id: "+e2.id);
	   System.out.println("Employe name: "+e2.name);
	   System.out.println("Employe salary: "+e2.salary);
	   
	  
	
	}

}

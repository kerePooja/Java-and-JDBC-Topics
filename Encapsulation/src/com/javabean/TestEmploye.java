package com.javabean;

public class TestEmploye {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
	   System.out.println("employe id: "+e1.getId()+" employee name: "+e1.getName());
		
		e1.setId(101);
		e1.setName("pooja");
		
		int id=e1.getId();
		String name=e1.getName();
		
		 System.out.println("id:"+id);
		 System.out.println("name:"+name);
		 
		  System.out.println("-------------------");
		  
		   System.out.println(e1.getId());
		   System.out.println(e1.getName());

		   System.out.println("-------------------");
		   
		   System.out.println("employe id "+e1.getId()+"employee name"+e1.getName());
		
		
		
	}


}

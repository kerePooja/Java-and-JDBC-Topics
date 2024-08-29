package org;

public class Student {

	String name;
	
	Student(String name) {
	  this.name=name;
	}
	
	@Override
	public String toString() {
		return "name:"+this.name;
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student("pooja");
		Student s2=new Student("java");
		
		System.out.println(s1);
		System.out.println(s2);
	
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	
	
	}
	
	
	
}

package com;

public class StudentQ {
	int marks;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentQ s1=new StudentQ();
		StudentQ s2=new StudentQ();
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		
		System.out.println("-------");
		
		s1.name="pooja";
		s1.marks=98;
		s2.name="shinoy";
		s2.marks=100;
		
		System.out.println(s1.name+" is got "+s1.marks+" marks in java");
		System.out.println(s2.name+" is got "+s2.marks+" marks in java");
		
		
		

	}

}

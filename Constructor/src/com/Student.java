package com;

class Student {
	int age;
	
	Student(int a){
		
		 age=a;
		
		
	}

	public static void main(String[] args) {
        
		Student s=new Student(10);
		Student s1=new Student(11);
		Student s2=new Student(12);
		
		System.out.println("Age: "+s.age);
		System.out.println("Age: "+s1.age);
		System.out.println("Age: "+s2.age);

	}

}

package com.javabean;

public class Student {
	
	private int age;

	public void setAge(int age) {
	   if(age>0) 
	   {
		System.out.println("age is initialized");
		this.age = age;
	   }else{
			System.out.println("age is  not initialized");
	   }
	}

	public int getAge() {
		return age;
	}
	

}

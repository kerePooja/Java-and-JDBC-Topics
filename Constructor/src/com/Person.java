package com;

public class Person {
	
	int age;
	String name;
	
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		
		Person p1=new Person(11,"p");
		Person p2=new Person(12,"o");
		Person p3=new Person(13,"p");
		
		System.out.println("Peson details");
		System.out.println("-------------");
		
		System.out.println("Name: "+p1.name+" "+"age:"+p1.age);
		System.out.println("Name: "+p2.name+" "+"age:"+p2.age);
		System.out.println("Name: "+p3.name+" "+"age:"+p3.age);
		
		
		
		
		
		

	}

}

package com;

public class Employee extends Person{
	@Override
	void work() {
		System.out.println("working");//if we want ro inherit 
	}
	public static void main(String[] args) {
		Employee E=new Employee();
		E.work();
	}
	
}

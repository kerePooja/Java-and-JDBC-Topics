package com;

public class Car {
	 static int cost=10;

	public static void main(String[] args) {
		System.out.println(Car.cost);//cost
		Car.cost=20;//car=20
		System.out.println(Car.cost);//cost
		
		Car c1=new Car();
		System.out.println(c1.cost);//not a good practice
		

	}

}

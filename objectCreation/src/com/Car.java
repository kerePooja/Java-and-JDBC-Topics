package com;

public class Car {
int cost=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Car c1=new Car();

		System.out.println(c.cost);
		System.out.println(c1.cost);
		
		c.cost=20;
		c1.cost=30;
		System.out.println(c.cost+" "+c1.cost);
	}

}

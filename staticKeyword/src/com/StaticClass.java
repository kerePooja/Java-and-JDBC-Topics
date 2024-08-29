package com;
/*Accessing static properties within the same class*/
public class StaticClass {
	
	static int a=10;
	static void Study() {
		System.out.println("studying");
	}

	public static void main(String[] args) {
		System.out.println(a);//within class it is not manditory to call callname
		Study();
		System.out.println("-------");
		
		System.out.println(StaticClass.a);
		StaticClass.Study();
	}

}

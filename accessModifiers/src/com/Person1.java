package com;

public class Person1 {
	
	class A{
		//one class present in another class
	}
		private int age=25;
		
		private Person1() {
			System.out.println("Im  private person Constructor");
		}
		
		private void walk() {
			System.out.println("person is walking method private");	
		}

		public static void main(String[] args) {
			
			Person1 p=new Person1();
			System.out.println(p.age);
			p.walk();
			
		}
	}



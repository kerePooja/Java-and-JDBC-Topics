package com;

 class Person2 {///outer class cannot be private and protected
	class A{
		//one class present in another class
	}
		protected int age=25;
		
		protected Person2() {
			System.out.println("Im person  protected Constructor");
		}
		
		protected  void walk() {
			System.out.println("person is walking method is protected");	
		}

		public static void main(String[] args) {
			
			Person2 p2=new Person2();
			System.out.println(p2.age);
			p2.walk();
			
		}
	}


package com;

 class Person3 {
	class A{
		//one class present in another class
	}
	    int age=25;
		

		Person3() {
			System.out.println("Im person default Constructor");
		}
		
	  void walk() {
			System.out.println("person is walking in default method");	
		}

		public static void main(String[] args) {
			
			Person3 p3=new Person3();
			System.out.println(p3.age);
			p3.walk();
			
		}
	}




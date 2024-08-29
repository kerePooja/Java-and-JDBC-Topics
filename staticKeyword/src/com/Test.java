package com;
/*Acessing static properties within the different class*/
public class Test {
		public static void main(String[] args) {
			//System.out.println(id);
			//work();//cont do this in different classes
			System.out.println("-------");
			
			System.out.println(Employe.id);
			Employe.work();
		}

	}


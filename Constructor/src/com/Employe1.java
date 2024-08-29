package com;

public class Employe1 {

		int id;
		String name;
		double salary;
		
		Employe1(int id, String name, double salary) {
			this.id=id;
			this.name=name;
			this.salary=salary;
			}
		void display() {
			   System.out.println("Employe Id: "+this.id);
			   System.out.println("Employe name: "+this.name);
			   System.out.println("Employe salary: "+this.salary);
			}
		
		    public static void main(String[] args) {
			Employe1 e1=new Employe1(101,"pooja",25000.67);
			Employe1 e2=new Employe1(102,"shinoy",600000.65);
			
			System.out.println("Employe Details");
			System.out.println("==============");
			
			e1.display();
			
			System.out.println("---------------");
			
            e2.display();
		 }

	}

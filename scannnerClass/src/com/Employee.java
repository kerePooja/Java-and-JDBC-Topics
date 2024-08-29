package com;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Id of an employe:");
		int Id = scan.nextInt();
		
		System.out.println("Enter Name of an employee:");
		String Name = scan.next();
		
		System.out.println("Enter salary of an employee");
		float Salary = scan.nextFloat();
		
		
		System.out.println("Id "+Id+"  Name: "+Name+"  Salary: "+Salary);
		
        
		scan.close();

	}

}
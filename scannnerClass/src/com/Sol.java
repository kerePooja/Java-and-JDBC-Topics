package com;
import java.util.Scanner;
public class Sol {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		
	 Scanner sc=new Scanner(System.in);
	
	 for(int i=1;i<=5;i++) {
		 System.out.println("enter the value of a:");
			int a=sc.nextInt();
			d.M1(a);
		 
			sc.close();
	 }
		
	}

}

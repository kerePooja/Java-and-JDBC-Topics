package arraysInJava;

import java.util.Scanner;

public class InputfromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		System.out.println("enter a decimal number");
		Scanner sc1=new Scanner(System.in);
		double num1=sc1.nextDouble();
		System.out.println("Given decim1al number is"+num1);*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st  number");
		 int num1=sc.nextInt();
		 
		 System.out.println("enter 2nd number");
		 int num2=sc.nextInt();*/
		
		int[] a=new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("enter a vlue for the position "+i+":");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<=a.length-1;i++) {
			//System.out.println("enter a vlue for the position "+i+":");
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}

package com;
import java.util.Scanner;

public class Solution {
    
	void add(int a, int b)
	{
		int Sum=a+b;
		System.out.println(Sum);
	}
	
	public static void main(String[] args) {
		
		Solution s=new Solution();
		
		Scanner scan=new Scanner(System.in);
		
		/*System.out.println("enter the value of a:");
		int a=scan.nextInt();
		
		System.out.println("enter the value of b:");
		int b=scan.nextInt();*/  // one time we can use it
	
		
		for(int i=1;i<=3;i++) {
		
			System.out.println("enter the value of a:");
			int a=scan.nextInt();
			
			System.out.println("enter the value of b:");
			int b=scan.nextInt();
			s.add(a,b);
	}

}
}

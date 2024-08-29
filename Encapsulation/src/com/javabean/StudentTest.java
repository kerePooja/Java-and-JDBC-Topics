package com.javabean;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student s=new Student();
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the age of the student");
		int age=sc.nextInt();
		s.setAge(age);//for Avoid illogical things
		System.out.println(s.getAge());

	}

}

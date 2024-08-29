package org;

public class Person {
	@Override
	public String toString() {
	   return "hi pooja";
	}
	public static void main(String[] args) {
	    Person p=new Person();
		System.out.println(p);//implicitly call toString method
		System.out.println(p.toString());//explicitly call toString method

	}

}

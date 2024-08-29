package com;

public class Test {
	
	int display() {
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("start");
		
		Test t = new Test();
		
		
		int result =t.display();
		System.out.println(result);

		System.out.println(t.display());
		System.out.println("end");
	}

}

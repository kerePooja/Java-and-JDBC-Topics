package com;

public class Son extends Father {
	
	Son(){
		//super(); implicitly
		// father constructor is parameterized then we have to write explicitly
		super(12);
		System.out.println("i am Son");
	}

}

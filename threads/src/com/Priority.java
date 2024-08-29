package com;

public class Priority {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		//Thread.currentThread().setPriority(12);
		Thread t=new Thread();
	    System.out.println(t.getPriority());
	}
	

}

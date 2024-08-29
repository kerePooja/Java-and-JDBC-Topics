package com;

public class TestMyThread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread1 t=new MyThread1();
		System.out.println(t.getName());//thread we have created
		Thread.currentThread().setName("pooja");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
		
	}

}

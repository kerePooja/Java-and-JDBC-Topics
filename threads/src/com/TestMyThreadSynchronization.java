package com;

public class TestMyThreadSynchronization {
	
	public static void main(String[] args)  {
		
		display d1=new display();
		display d2=new display();
		MyThreadSynchronization t1=new MyThreadSynchronization(d1,"pooja");
		MyThreadSynchronization t2=new MyThreadSynchronization(d2,"Shinoy");
	//	MyThreadSynchronization t3=new MyThreadSynchronization(d1,"Naveen");
	//	MyThreadSynchronization t4=new MyThreadSynchronization(d2,"Mahesh");
		
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
		
		
		
	}

}

package com;

public class TestMyThreadJoin  {
	
	public static void main(String[] args) throws InterruptedException {
	MyThreadJoin t =new MyThreadJoin();
	t.start();
	
	//t.join();
	t.join(10000);
	
	 for(int i=0; i<10; i++) {
		 System.out.println("Raama thread");
	 }
	}
}

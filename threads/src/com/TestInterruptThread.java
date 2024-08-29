package com;

public class TestInterruptThread {
	
	public static void main(String[] args) throws InterruptedException   {
		
		InterruptThread t=new InterruptThread();
		t.start();
		
		t.interrupt();
		System.out.println("End of main");
	}

}

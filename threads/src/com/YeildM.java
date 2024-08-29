package com;

public class YeildM  extends Thread{
	public void run() {
		  for(int i=0; i<10; i++) {
			  System.out.println("Child Yeild Thread");
			  Thread.yield();
		  }
	  }

	}




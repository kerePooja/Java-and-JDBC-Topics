package com;

public class display {
	
	public  synchronized void wish(String name) {// static we have to use if we use 2 methods
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning:");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){ }
			System.out.println(name);
	  }
	}
	
}

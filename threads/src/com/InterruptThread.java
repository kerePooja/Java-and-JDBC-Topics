package com;

public class InterruptThread extends Thread {
	
	public void run(){  
		try {
		for(int i=0; i<10; i++) {
			System.out.println("Iam Lazy Thread");
			Thread.sleep(2000);
		}
	}
	catch(InterruptedException e) {
		System.out.println("i got interrupted");
	}
}
}




package com;

public class MyThreadJoin1 extends Thread { 
	public static Thread mt;
	public void run() {
			 try {
				 	mt.join();
			 }
			 catch (InterruptedException e) {}
			 for(int i=0; i<10; i++) {
				 System.out.println("child thread");

			 }
		 }
}

package com;

public class MyThreadSynchronization extends Thread {
	
	display d;
	String name;
   MyThreadSynchronization(display d,String name){
		 this.d=d;
		 this.name=name;
	 }
   
	public void run() {
		d.wish(name);
		 
	 }
}
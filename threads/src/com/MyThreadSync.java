package com;

public class MyThreadSync extends Thread {
	
	Display1 d;
	
	MyThreadSync(Display1 d){
		this.d=d;
	}
	public void run() {
		d.displayn();
	}

}

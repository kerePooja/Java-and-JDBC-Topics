package com;

public class MyThreadSync2 extends Thread {
	Display1 d;
	
	MyThreadSync2(Display1 d){
		this.d=d;
	}
	public void run() {
		d.displayc();
	}

}



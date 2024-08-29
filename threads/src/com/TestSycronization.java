package com;

public class TestSycronization {

	public static void main(String[] args) {
		Display1 d=new Display1();
		MyThreadSync t1=new MyThreadSync(d);
		MyThreadSync2 t2=new MyThreadSync2(d);
		t1.start();
		t2.start();
		

	}

}

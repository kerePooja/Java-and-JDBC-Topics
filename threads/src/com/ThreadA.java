package com;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b=new ThreadB();
		b.start();
		/*when we are doing updation calling method is not recommended because perfomance will be down */
		//Thread.sleep(100);
		Thread.sleep(1000);
		synchronized(b){
		System.out.println("main thread is trying to wait() method");
		//System.out.println(b.total);
		b.wait(1000);
		System.out.println("main thread got notification");
		System.out.println(b.total);
	}
  }
}

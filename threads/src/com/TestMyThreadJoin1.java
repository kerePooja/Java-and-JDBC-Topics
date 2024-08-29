package com;
public class TestMyThreadJoin1 {
public static void main(String[] args) throws InterruptedException {
	MyThreadJoin1.mt = Thread.currentThread();
			MyThreadJoin1 t =new MyThreadJoin1();
			t.start();
			//t.join();//deadlock situation no thread will execute it will stuck
			 for(int i=0; i<10; i++) {
				 System.out.println("Main thread");
				 Thread.sleep(2000);
			 }
			}
		}

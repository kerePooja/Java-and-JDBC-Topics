package com;

public class Display1 {

	public synchronized void displayn(){
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				}
			}
		}
		public synchronized void displayc() {
			for(int i=65; i<=75; i++) {
				System.out.println((char)i);
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) { }

		}
	}
}



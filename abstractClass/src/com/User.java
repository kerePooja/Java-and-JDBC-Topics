package com;

public class User extends Car {//concrete class
	@Override
	void start() {
		System.out.println("vehicle starting");
	}
	
    @Override
	void stop() {
		System.out.println("CAR stopping");
	}
	
   //optinally override of shiftgear method not neccessry
	public static void main(String[] args) {
		
		User u=new User();
		u.start();
        u.shiftGear();
        u.stop();
		
		

	}

}

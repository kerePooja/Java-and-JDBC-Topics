package com;

 class Kangaroo {
	 
	 double height=5.6; //member/global variable(non-static)
	 void display() 
	 {
		 double  height=4.4;
		 
		 System.out.println(height);
		 System.out.println(this.height);
		 //if we not use this keyword then local variable dominate the global variable
	}
	 
	 public static void main(String[] args) {
		 Kangaroo K =new Kangaroo();
		 K.display();
	 }

}

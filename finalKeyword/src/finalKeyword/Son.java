package finalKeyword;

public class Son extends Father {
	

	public static void main(String[] args) {
		
     Son s=new Son();
     s.bike();//final method cannot override but can be inherited
	}

}

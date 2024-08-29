package arraysInJava;

public class HeterogenousArray {

	public static void main(String[] args) {
		
		 Object a[]= {10,10.5,'a',"welcome",true};//root class of java
		
		 for(Object x:a) {
			 System.out.println(x);
		 }
		 System.out.println("-----");

		 for(int i=0; i<=a.length-1;i++) {
			 System.out.println(a[i]);
		 }

	}

}

package Day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList x=new ArrayList();
		x.add(10);
		System.out.println(x);
		
		 LinkedList y=new LinkedList(x);
		 y.add(20);
		 System.out.println(y);
		 
		 Vector z=new Vector(y);
		 z.add(30);
		 System.out.println(z);
			
		 
		
	  System.out.println("-----------------------");
	
	  ArrayList al1=new ArrayList();// default initial capacity will store i.e ArrayList()

	  ArrayList al2=new ArrayList(50);//ArrayList(int intial capacity)
	  
	  LinkedList ll=new LinkedList();
	  
	  Vector v1=new Vector();
	  
	  Vector v2=new Vector(30);
	  
	  Vector v3=new Vector(30,5);
	}

}

package Day3;

import java.util.ArrayList;
import java.util.LinkedList;
public class InterviewExample {

	public static void main(String[] args) {
		int a=10;
		char b='z';
		ArrayList al=new ArrayList();
		al.add(a);     //al.add(new Integer(a))->(new Integer(10)) , internally doing autoboxing
		al.add(9.0);   //al.add(new Double(9.0);
		al.add(b);     //al.add(new Character(b))->new Character(z))
		
	for(Object obj: al) {//upcasting
		System.out.println(obj);
	}
	 System.out.println("---------------");
	 LinkedList ll=new LinkedList();
	 
	 ll.add(10);
	 ll.add("pooja");
	 ll.add(5.6);
	 
	 for(Object o:ll) {//here we are using object beacuse all elements are different so to store hetergenous object we use common object
		 System.out.println(o);
	 }
	 
	 
	}

}

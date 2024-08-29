package Day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Runner {
		public static void main(String[] args) {
			
			ArrayList al=new ArrayList();
			
			al.add(10);
			al.add(20);
			System.out.println("object inside ArrayList is: "+al+" size of al is: "+al.size());
			
			System.out.println("--------------");
			
			LinkedList ll=new LinkedList();
			
			//addAll() is used to add all the object of one collection into another collection
			ll.addAll(al);
			ll.add(30);
			System.out.println("object inside LinkedList is: "+ll+" size of ll is: "+ll.size());
			//removeAll() is used to remove all the object of one collection from another collection
			ll.removeAll(al);
			
			System.out.println("object inside LinkedList is: "+ll+" size of ll is: "+ll.size());
			System.out.println("--------------");
			

	}

}

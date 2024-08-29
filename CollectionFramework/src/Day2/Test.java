package Day2;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
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
		
		System.out.println("--------------");
		
		//containsAll() is used to check if all the object of one collection is present in another collection or not
		System.out.println(ll.containsAll(al));//true
		System.out.println("object inside LinkedList is: "+ll+" size of ll is: "+ll.size());
		ll.remove(1);
		System.out.println(ll.containsAll(al));//false
		System.out.println("object inside LinkedList is: "+ll+" size of ll is: "+ll.size());
	}

}

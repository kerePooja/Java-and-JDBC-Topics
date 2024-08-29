package Day1;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		
		/* add() method is used to  add an object in to the collection*/
		l.add(10);
		l.add(20.34);
		l.add("java");
		l.add(null);
		l.add(10);
		System.out.println(l);//heterogenous object
		
		System.out.println("--------------------");
		
		/*size is used to return the length of the collection*/
		System.out.println(l.size());
		
		System.out.println("--------------------");
		
		/*get() is used to return an object based on the index position */
		System.out.println(l.get(2));
		
		//System.out.println(l.get(234));IndexOutOfBoundsException
		
		System.out.println("--------------------");
		//contains() is used to check  if the  object is present in the collection or not
		System.out.println(l.contains("java"));//true
		System.out.println(l.contains("Java"));//false
		
		System.out.println("--------------------");
		
		System.out.println(l);
		//remove() is used to remove an object based on the index position
		l.remove(2);
		System.out.println(l);
		
		System.out.println("--------------------");
		
		//isEmpty() is used to check if the collection is empty or not
		System.out.println(l.isEmpty());// to check empty or not
		
		l.clear();
		System.out.println(l.isEmpty());
		
		System.out.println("--------------------");
		
		ArrayList x= new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(40);
		l.add(10);
       
		System.out.println(l);//heterogenous object
		
		System.out.println("--------------------");
		//indexOf() is used to find index position of an object and first occurance in case of duplication// 
		System.out.println(l.indexOf(30));
		System.out.println(l.indexOf(10));
		System.out.println(l.indexOf(300));//-1 if the object is not present
		
		System.out.println("--------------------");
		
		
		//lastindexOf() is used to find last index position 
		System.out.println(l.lastIndexOf(30));
		
	} 

}

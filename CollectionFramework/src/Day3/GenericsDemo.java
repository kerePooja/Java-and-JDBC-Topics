package Day3;
import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {

	public static void main(String[] args) {
	  
		 ArrayList<String> al=new ArrayList<String>();
		 
		 al.add("10");
		 al.add("pooja");
		 al.add("shinoy");
		 
		 for(String a:al) {
			 System.out.println(a);
		 }

		  System.out.println("---------------");
		  LinkedList<Integer> ll=new LinkedList<Integer>();
		  
		  ll.add(10);
		  ll.add(20);
		  ll.add(30);
		  
		  for(Integer i:ll)   {               //for(int i:ll) 
			  System.out.println(i);
		  }
		  
		  System.out.println("---------------");
		  
		  ArrayList<Double> x=new ArrayList<Double>();
			 
			 x.add(10.1);
			 x.add(10.2);
			 x.add(10.2);
			 for(double X: x) {
				 System.out.println(X);
			 }
		  
		  
		  
	}

}

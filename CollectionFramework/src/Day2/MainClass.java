package Day2;
import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20);
		
        System.out.println(al);
        
        System.out.println("------------------------");
        System.out.println("Before Sorting");
         for(int i=0;i<al.size(); i++) {//traverse of collection
        	System.out.println(al.get(i));
         }
         
         Collections.sort(al);
         System.out.println("after Sorting");
          for(int i=0;i<al.size(); i++) {//traverse of collection
        	System.out.println(al.get(i));
         }
     
	}
	

}

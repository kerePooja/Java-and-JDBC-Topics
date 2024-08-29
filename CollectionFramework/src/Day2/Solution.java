package Day2;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		 ArrayList l = new ArrayList();
		 
		 l.add(10);
		 l.add(20);
		 l.add(30);

		 System.out.println(l);//[10,20,30]
		 //add(index,object) is used to add an object based on the index position
		 //already existing object is shifted to the next position
		 l.add(1,50);
		 
		 System.out.println(l);//[10,50,20,30]
		 //set(index,object) is used to add  an object based on the index position
		 //already existing object is overridden
		 l.add(1,50);
         l.set(2,70);
		 
		 System.out.println(l);//[10,50,70,30]
		 
		 
	}

}

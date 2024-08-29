package Day4;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(6);
		v.add("pooja");
		v.add(2.4);
		 
		for(Object o:v) {
			System.out.println(o);
		}
	
	}

}

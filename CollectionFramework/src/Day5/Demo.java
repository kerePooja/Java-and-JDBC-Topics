package Day5;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		
		h.add(10);
		h.add(10.4);
		h.add("pooja");
		h.add(10);
		h.add('S');
		
		
		for(Object o:h) {
			System.out.println(o);
		}
		
		
		System.out.println("===============");
		
		System.out.println("Size: "+h.size());
		
		System.out.println("===============");
		
		System.out.println(h);
		

	}

}

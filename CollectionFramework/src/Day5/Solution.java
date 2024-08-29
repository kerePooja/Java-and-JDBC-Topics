package Day5;

import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
      
		TreeSet<String> ts=new TreeSet();
		
		ts.add("B");
		ts.add("C");
		ts.add("A");
		
		 System.out.println(ts);
		
		System.out.println("===============");
		
		for(String i:ts) {
			System.out.println(i);
		}
		

	}

}

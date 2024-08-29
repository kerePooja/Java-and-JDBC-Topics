package Day5;

import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
		String a="A";
		String b="B";
		
		System.out.println(a.compareTo(b));//-1
		System.out.println(b.compareTo(a));//+1
		System.out.println(b.compareTo(b));//0
		
		System.out.println("-----------");
		
		Integer x=10;
		Integer y=20;
		
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));//+1
		System.out.println(y.compareTo(y));//0
        System.out.println("-----------");
		
		Double i=10.9;//double gives error because collection does not support primitive
		Double j=20.9;
		
		System.out.println(i.compareTo(j));
		System.out.println(j.compareTo(i));//+1
		System.out.println(j.compareTo(j));//0
		
		System.out.println("-----------");
		
		TreeSet t=new TreeSet();
		//compareTo compares only homogeneous so always three set allows only homogenous itmes
		t.add(10);
		t.add(false);
		t.add("dinga");
		t.add(10.9);
        System.out.println(t);
	}

}

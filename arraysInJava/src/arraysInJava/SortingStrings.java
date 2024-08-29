package arraysInJava;

import java.util.*;


public class SortingStrings {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= {'a','d','b','c','e'};
		
		System.out.println("befor sorting");
		
		for(int i=0; i<=a.length-1;i++) {
				System.out.print(a[i]+" ");
				
			}
		System.out.println();
	
   
   //by using one method also we can run the arrays by using to String
   
   System.out.println(Arrays.toString(a));
   
   Arrays.sort(a);//sort elements 
   System.out.println("after sorting");
   System.out.println(Arrays.toString(a));
   
   
     System.out.println("-------------");
   
   
   String[] b= {"pooja","shanker","kere"};
   System.out.println("befor sorting");
   System.out.println(Arrays.toString(b));
   Arrays.sort(b);//sort elements 
   System.out.println("after sorting");
   System.out.println(Arrays.toString(b));
   
   
   

   
   

	}

}


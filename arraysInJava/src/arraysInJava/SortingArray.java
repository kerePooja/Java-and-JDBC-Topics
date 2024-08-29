package arraysInJava;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {100,200,500,600,300};
		
		System.out.println("before sorting");
		
		for(int i=0; i<=a.length-1;i++) {
				System.out.print(a[i]+" ");
				
			}
		System.out.println();
		
		
   System.out.println("--------");
   
   //by using one method also we can run the arrays by using to String
   
   System.out.println(Arrays.toString(a));
   
   Arrays.sort(a);//sort elements 
   System.out.println("after sorting");
   System.out.println(Arrays.toString(a));
   
   System.out.println("--------");
   
   

   Arrays.sort(a);
   for(int i=0; i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
		
	}
   

	}

}

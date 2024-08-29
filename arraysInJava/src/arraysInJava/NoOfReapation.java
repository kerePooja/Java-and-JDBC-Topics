//no of reaption in an array
package arraysInJava;

public class NoOfReapation {

	public static void main(String[] args) {
	  int a[]= {10,20,20,30,20,30,20,70};
	  int duplicate_number=70;
	  int count =0; 
	 
	  
	  
	  for(int i=0;i<=a.length-1;i++) {
		  //System.out.println(a[i]);
		  if(a[i]==duplicate_number) {
			  count++;
		  }
		 
	  }
	  System.out.println(count);
	  

	}

}

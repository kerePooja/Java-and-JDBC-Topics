package arraysInJava;

public class Array2 {
	public static void main(String args[]) {
	
	int[] b = {1,2,3,4,5};
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	
	System.out.println("----");
	
	for(int i=0; i<=2;i++) {//we can print lyk this also but it becomes hard coding
		System.out.println(b[i]);
	}

	
	System.out.println("----");
	
	// we have to use array length keyword
	
		for(int i=0;i<b.length; i++) {
			System.out.println(b[i]);
			
		}	
		
		System.out.println("----");
		
		
		
		for(int i=0;i<=b.length-1; i++) {//for <= means we have to use a.length-1 to match the index and size  of the array
			System.out.println(b[i]);
			
		}	
		
		
		
		
		
		
		
		System.out.println("----");	

		for(int i=b.length-1; i>=0; i--) {//lenth of array is 5 and size of array is 4
			System.out.println(b[i]);
			
		}	

}
}

package arraysInJava;

public class Arrays1 {

	public static void main(String[] args) {
		
		int[] a;//array declarion
		a=new int[5];//array creation
		

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("--------------");
		
		

        //array initialization	
		
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("length"+a.length);
		
		System.out.println("--------------");
		System.out.println("--------------");
		
		
		//array declaration and creation togather
		int[] b = {1,2,3};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println("length"+b.length);
		

		
		
		
	}

}

package Day3;

public class BoxingDemo {

	public static void main(String[] args) {
		//primitive way of representing 10
		int a=10;
		//non-primitive way of representing 10
		Integer b=new Integer(10);
		
		System.out.println(a+" "+b);

		 System.out.println("---------------");
		
		//primitive way of representing A
		  char x='A';
		//non-primitive way of representing A
		  Character y=new Character('A');
				
		  System.out.println(x+" "+y);
		  
		  System.out.println("==================");
          //Autoboxing
		  int i =10;
		  Integer j=new Integer(i);
		  System.out.println(i+" "+j);
		  
		  System.out.println("---------------");
		  
		  char C='A';
		  Character D=new Character(C);
		  System.out.println(C+" "+D);
		  
		  System.out.println("==================");
		  //AutoUnboxing
		  Integer p=new Integer(10);
		  int q =a;
		  System.out.println(C+" "+D);
		  
		  System.out.println("---------------");
		  
//		  Character r=new Character('Z');
//		  int s =r;
//		  System.out.println(r+" "+s);
		  
		  Double obj=new Double(5.3);
		  double d =obj;
		  System.out.println(d+" "+obj);	  
		  	
	}

}

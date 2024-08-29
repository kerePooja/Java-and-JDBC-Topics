package classCastException;

public class Test {
	
public static void main(String[] args) {
	
/*	Father f=new Son(); //upcasting
	Son s=(Son) f;*/
	
	Father f=new Father();
	Son s=new Son();
	Daughter d=new Daughter();
	
	
	 System.out.println(s.x+" "+s.y);
	 System.out.println("======================");
	 
	 System.out.println(s instanceof Son );
	// System.out.println(s instanceof Daughter);it will through error
	 System.out.println(s instanceof Father );
	 
	 System.out.println("======================");
	 
     System.out.println(d instanceof Father );
   //  System.out.println(d instanceof Son ); it will through error
     System.out.println(d instanceof Daughter  );
     
     System.out.println("======================");
     
     System.out.println(f instanceof Father );
     System.out.println(f instanceof Son );
	 System.out.println(f instanceof Daughter );
	 
	 System.out.println("----------------------");
	 
	 
	 System.out.println(new Father() instanceof Father );
     System.out.println(new Son() instanceof Son );
	 System.out.println(new Daughter() instanceof Daughter );
}
}

/*Father f=new Son(); //upcasting
Daughter d=(Daughter) f;*/ //classcastException

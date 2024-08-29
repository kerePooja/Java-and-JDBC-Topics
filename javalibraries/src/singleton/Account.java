package singleton;

public class Account {
	
     private static Account obj=null;//method static we aare using this variable inside that so we are making this also sstatic
	
	
	private Account() {
		System.out.println("Object created");
	}
	
    public static void createObject() { //here we are making it static because we dont wnat create object so for static we can call it outside the class with class name without using object creation
    	if(obj==null) {
    		obj= new Account();
    	}
    	else {
    		System.out.println("cannot create object");
    	}
	     
   }
}

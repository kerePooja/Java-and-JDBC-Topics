package publicaccessModifiers;

/*Accessing the public member outside the class but in same package*/

public class TestStudent {
	public static void main(String[] args) {
	  Student s=new Student();
	    System.out.println(s.marks);
	    s.study();
	  
	}

}

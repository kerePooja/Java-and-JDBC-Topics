package nonPrimitivetypeCasting;

public class Test {

	public static void main(String[] args) {
	
		/*DownCating*/
		Father f=new Son();
		
		System.out.println(f.age);//f.name is willgive error
		
		/*Son s= new Son();
		Father f=s;*/
		//System.out.println(f.age);
		//System.out.println(f.String);
		
		/*DownCasting */
	     Son s=(Son) f;
	     System.out.println(s.age);
		System.out.println(s.name);
		
		 System.out.println(s.age+" "+s.name);
		
		
	}

}

package classCastException;

public class Solution {

	public static void main(String[] args) {
		System.out.println("START");
		//we can do declaration and initialization separatly
		/*Father f;
		f=new Son();*/

		Father f=new Daughter(); //upcasting*/
		//To avoid CCE we use instance of
		
		if(f instanceof Son) {
			System.out.println("DownCasting the Son ");
			Son s=(Son) f;
			 System.out.println(s.x+" "+s.y);
			
			
			
		}
		else if(f instanceof Daughter ) {
			System.out.println("DownCasting the Daughter ");
			Daughter d=(Daughter) f;
			 System.out.println(d.x+" "+d.z);
		}
		System.out.println("End");
	}

}

/*Father f=new Son(); //upcasting
Daughter d=(Daughter) f;*/ //classcastException

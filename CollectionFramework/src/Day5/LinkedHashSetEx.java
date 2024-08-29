package Day5;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add("shinoy");
		lhs.add("pooja");
		lhs.add("papa");
		lhs.add("mummy");
		lhs.add("mummy");
		
		System.out.println(lhs);
		
		System.out.println("===============");
		
		for(String s:lhs) {
			System.out.println(s);
		}
		
		System.out.println("===============");
		
		System.out.println("Size: "+lhs.size());
				
		
	}

}

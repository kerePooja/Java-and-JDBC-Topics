package Day5;
import java.util.TreeSet;
public class Runner {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet();
		
		ts.add(30);
		ts.add(30);
		ts.add(10);
		ts.add(20);
		ts.add(40);
		
		System.out.println(ts);
		
		System.out.println("===============");
		
		for(int i:ts) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		System.out.println("Size: "+ts.size());
				
		
	}

}

package Day3;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] a= {10,20,30};
		
		for(int i : a){
			System.out.println(i);
		}
		System.out.println("---------------");
		
		double[] percentage= {1.3,7.9,5.8,9.0};
		for(double p :percentage) {
			System.out.println(p);
		}
	System.out.println("---------------");
		
		String[] fruits= {"Mango","Avacado","Orange","Apple"};
		for(String f : fruits) {
			System.out.println(f);
		}
		

	}

}

package arraysInJava;

public class OddArray {

	public static void main(String[] args) {
		int a[]= {1,5,6,9,4,8};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("-------------");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}
		
	









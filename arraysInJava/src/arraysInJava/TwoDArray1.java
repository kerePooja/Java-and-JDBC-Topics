package arraysInJava;

public class TwoDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{10,11,12},
				{13,14,15},
				{16,17,18}
				};
		for(int i=0; i<=a.length-1;i++) {
			for(int j=0; j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("--------");

		//by using for each loop
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
				
			}
			System.out.println();
		}
		
	   
		
	}

}

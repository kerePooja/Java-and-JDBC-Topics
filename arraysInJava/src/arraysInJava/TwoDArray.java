package arraysInJava;

public class TwoDArray {

	public static void main(String[] args) {
		//1st way
		//int[][] a=new int[3][2];
	   /*a[0][0]=10;
		a[0][1]=20;
		a[1][0]=10;
		a[1][1]=20;
		a[2][0]=10;
		a[2][1]=20;
		*/
		//2nd way
		int[][] a= {
				{10,11},
				{12,13},
				{14,15}
				};
       //find length of an array
		System.out.println("length of row "+a.length);
		System.out.println("length of column "+a[0].length);
		
		
		//to find single values
		System.out.println(a[0][0]);
		System.out.println(a[2][1]);
		
		
		System.out.println("-----------------");
		
		
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
			}
		System.out.println("-----------------");
	
		
		 for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}		

	}

	}


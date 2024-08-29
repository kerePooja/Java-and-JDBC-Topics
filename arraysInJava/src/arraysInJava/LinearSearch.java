package arraysInJava;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,40,50};
		int search_element=40;
		boolean status = false;//to maintain the status false means not found status true means found
		/*for(int i=0;i<=a.length-1;i++) {
			if(a[i]==search_element) {
				System.out.println(a[i]);
			}
		}*/  //you can do this but prblem is if not matched with array it will show nothing

		
		for(int i=0;i<=a.length-1; i++) {
			if( search_element==a[i]) {
			System.out.println(a[i] +" element is found");
			status=true;
			break;
	
			}
		}
			if(status==false) {
				System.out.println("element is not found");
				
			}
		}
		
		
		
		
		
	}



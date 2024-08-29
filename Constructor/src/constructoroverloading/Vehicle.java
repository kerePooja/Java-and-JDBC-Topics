package constructoroverloading;

public class Vehicle {
	
	Vehicle(String brand,int cost){
		System.out.println("brand: "+brand+" cost:"+cost);
	}
    Vehicle(String brand){
    	System.out.println("brand: "+brand);
 	}
   Vehicle(String brand,String fuel){
	   System.out.println("brand: "+brand+" fuel:"+fuel);
		
	}
   Vehicle(int cost,String brand){
	   System.out.println(" cost:"+cost +"brand: "+brand);
   }
  
   Vehicle(){
	   System.out.println("no constructor: ");
   }
	   public static void main(String[] args) {
		   Vehicle v1=new Vehicle("BMW",30000);
		   Vehicle v2=new Vehicle("BMW");
		   Vehicle v3=new Vehicle("BMW","petrol");
		   new Vehicle(35000,"pooja");
		   new Vehicle();
		  Vehicle v5=new Vehicle();
	   
	   
	}

}

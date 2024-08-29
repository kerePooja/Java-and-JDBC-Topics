package defaultModifier;

 class Laptop {
	 
	static int cost=45000;
	 
	  static void  develop(){
		 System.out.println("Developing");
	 }
	 
	 public static void main(String[] args) {
	/*	Laptop l=new Laptop();
		System.out.println(l.cost);
		l.develop();  of the variable and method are non-static*/

		 System.out.println(cost);
		 develop();
		 
	}

	
}

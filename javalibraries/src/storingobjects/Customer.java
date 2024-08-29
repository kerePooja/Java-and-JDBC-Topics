package storingobjects;

public class Customer {

	public static void main(String[] args) {
		Laptop l1=new Laptop("lenova",50000,"i5");
		Laptop l2=new Laptop("samsung",80000,"i3");
		Laptop l3=new Laptop("apple",70000,"mac m2");
		Laptop l4=new Laptop("hp",70000,"i4");
		
	  
	  Laptop[] l= {l1, l2, l3, l4};
	  
	  for(int i=0;i<=l.length-1;i++) {
		  System.out.println(l[i]);
	  }
	  
}

}

package compileTime;

public class Customer {
	public static void main(String[] args) {
		
		Myntra m=new Myntra();
		
		m.purchase("Tank-Top");
		m.purchase(101);
		m.purchase("Tank-top",101);
		m.purchase(101,"Tank-top");
		
		
		
	}

}

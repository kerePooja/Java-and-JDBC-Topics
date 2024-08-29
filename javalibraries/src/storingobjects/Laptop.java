package storingobjects;

class Laptop {
	
	String brand;
	int cost;
	String ramSize;
	
	Laptop(String brand,int cost,String ramSize){
		this.brand=brand;
		this.cost=cost;
		this.ramSize=ramSize;
	}
	
	@Override
	public String toString() {
		return "my laptop brand is:"+brand+" is of cost"+cost+" and ram is of size"+ramSize;
	}
	

}

package defaultSorting;

public class Car implements Comparable<Car>{
	
	int cost;
	
	Car(int cost){
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "cost: "+cost; 
		}
	
	public int compareTo(Car c)
	{ 
		return this.cost-c.cost;
	}
	
}
	
	
	
	
	
	
	
	
	
/*
 * public static void main(String[] args) { Car c=new Car(100);
 * System.out.println(c);
 * 
 * String s=new String("java");//tosting override string System.out.println(s);
 * 
 * Integer i =new Integer(10);//toString override wrapper classes
 * System.out.println(i); }
 * 
 * }
 */
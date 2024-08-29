package usingConstructor;

public class Car {

	private int cost;
	Car(int cost){
		if(cost>0) {
		this.cost=cost;
		}
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		if(cost>0) {
			this.cost=cost;
			}
	}
}
	


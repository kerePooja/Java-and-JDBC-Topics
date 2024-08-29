package com;

public class SolutionAssignment {

	public static void main(String[] args) {
	
		Assignment SA1 =new Assignment();
		Assignment SA2 =new Assignment();
		Assignment SA3 =new Assignment();
		
		SA1.id=101;
		SA1.name="pooja";
		SA1.salary=40000;
		
		SA2.id=102;
		SA2.name="shinoy";
		SA2.salary=4000000;
		
		SA3.id=103;
		SA3.name="naveen";
		SA3.salary=40;
		
		
		System.out.println(SA1.name+" of employee id "+SA1.id+ " have salary "+SA1.salary);
		System.out.println(SA2.name+" of employee id "+SA2.id+" have salary "+SA2.salary);
		System.out.println(SA3.name+" of employee id "+SA3.id+" have salary "+SA3.salary);
		
		
	}

}

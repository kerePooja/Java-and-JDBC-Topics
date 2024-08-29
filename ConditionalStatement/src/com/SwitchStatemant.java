package com;

public class SwitchStatemant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=3;
		switch(choice){
		 case 1:System.out.println("i have choice of 1");
		  break;
		case 2:System.out.println("i have choice of 2");
		break;
		case 3:System.out.println("i have choice of 3");
		break;
		default :System.out.println("Invalid choice");
		
		}
		
		char grade ='A';
		switch(grade) {
		case 'A':System.out.println("student is good with grade A");
		break;
		case 'B':System.out.println("student is avarage with grade A");
		break;
		case 'C':System.out.println("student is bad with grade C");
		break;
        default:System.out.println("invalid grade");
		}

	}

}

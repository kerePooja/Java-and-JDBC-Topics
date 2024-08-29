package bankapp;
import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	
	System.out.println("WELCOME TO ATM");
	System.out.println("===============");
	
	Scanner scan=new Scanner(System.in);
	Bank b=new ATM();
	
	while(true) {
	System.out.println("1:Deposite\n2:Withdraw\n3:Checkbalence\n4:Exit");
	System.out.println("Enter Choice");
	int choice=scan.nextInt();
	
	switch(choice) {
	    case 1:
		   System.out.println("enter amount to be Deposited");
		   int dAmt=scan.nextInt();
		   b.deposit(dAmt);
		   break;
	    case 2:
		   System.out.println("enter amount to be Withdraw");
		   int WAmt=scan.nextInt();
		   b.withdraw(WAmt);
		   break;
	   case 3:
			  b.checkBalence();
			   break;
	    case 4:
			System.out.println("Thank you");
			System.exit(0);//to exit from the loop//terminate the loop
			
        default:
				System.out.println("Invalid choice");
	 }
	System.out.println("------------");
	
   }
 }
}

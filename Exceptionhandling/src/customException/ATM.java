package customException;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		int balence=10000;
		
		System.out.println("enter tha amount to be withdraw");
		int amount=s.nextInt();
		
		if(amount<=balence) {
			System.out.println("withdraw successfully!!");
		}
		else
		{
			try {
				InsufficientBalenceException obj = new InsufficientBalenceException();
				throw obj;
			}
			catch(InsufficientBalenceException e) {
				System.out.println("not enough balence to withdraw :)");
			}
		}
		
		s.close();
		
	}

}

package customException;
import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("enter the id");
		String id=scan.next();
		System.out.println("enter the name");
		int password=scan.nextInt();
		
		if(id.equals("Admin")) {
			if(password==123) {
				System.out.println("login successfully");
			}
		
		}
		else{
			   try
			   {
				InvalidPasswordException obj = new InvalidPasswordException();
				throw obj;
			   }
			   catch(InvalidPasswordException e)
			   {
				   System.out.println("Invalid Password enterd!!");
			   }
			}
		scan.close();
	}
	
		

	}



package customException;
import java.util.Scanner;
public class MatrimonyPortal {
	

public static void main(String[] args)  
   {
	   Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the age");
       int age=sc.nextInt();
       
       if(age>=21) 
       {
    	   System.out.println("ready for marriege");
       }
       else
       {
    	   try 
    	   {
              throw new AgeInvalidException("you are minor have some patience!!");
    	   }
    	   catch( AgeInvalidException e) 
    	   {
    		   System.out.println(e.getMessage());
    	   }
    		 /*
			 * 23AgeInvalidException obj=new AgeInvalidException("have patience!!"); throw
			 * obj;
			 */
       }
	}
	
}

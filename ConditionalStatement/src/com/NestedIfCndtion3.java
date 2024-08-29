package com;

public class NestedIfCndtion3 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
        char gender='M';
      // char gender='f';
        int age=26;
       
       if(gender== 'M')
       {
    	  System.out.println("gender is male");
    	   
           if(age>=21) {
    	   System.out.println("He have right to marry");
    	   }
           else {
    	   System.out.println("He dont have right to marry");
       }
       }
       else if(gender=='F'){
    	   System.out.println("gender is female");
        if(age>=18) {
    	   System.out.println("you have right to marry");
           }
         else {
    	   System.out.println("She dont have right to marry");
         }
	  }
         else {
        	 System.out.println("Invalid input");
         }
       }   
	}



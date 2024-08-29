package com;

public class NestedIfCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String User_Id="kerepooja70@gmail.com";
		int Password=9945;
		
	if(User_Id == "kerepooja70@gmail.com") {
			System.out.println("User id is valid");
		 if(Password == 1233) {
			 System.out.println("password is valid");
			 System.out.println("login successfully");
			}
		 else {
			 System.out.println("Password is wrong");
		 }
	}
else {
		System.out.println("User-Id is invalid");
		System.out.println("login is unsuccessfull");
	}

}
}

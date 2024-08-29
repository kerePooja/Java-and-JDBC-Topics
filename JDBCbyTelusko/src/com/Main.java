package com;

import java.sql.*;

public class Main {
   
	public static void main(String[] args) throws Exception {
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String query="select name from employees where id=12";
		 
		
		Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("connected Succesfully");
	    
	   	Statement stmt=con.createStatement();
	     ResultSet rs=stmt.executeQuery(query);
	     
	     rs.next();//responsible for take you to the next element
	     String name =rs.getString("name");
	     System.out.println(name);
	   	
	   	stmt.close();
	   	con.close();

	}

}

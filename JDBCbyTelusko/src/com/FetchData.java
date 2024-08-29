package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws Exception {
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String query="select * from employees";
		 
		
		Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("connected Succesfully");
	    
	   	Statement stmt=con.createStatement();
	    ResultSet rs=stmt.executeQuery(query);
	    
	   // String UserData="";
	     while(rs.next())//responsible for take you to the next element
	     {
	    String UserData = rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getDouble(4);
	     System.out.println(UserData);
	     }
	   	
	   	stmt.close();
	   	con.close();

	}
}

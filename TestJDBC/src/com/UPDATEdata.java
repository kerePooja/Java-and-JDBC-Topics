package com;

import java.sql.*;


public class UPDATEdata {
	 public static void main(String[] args) throws ClassNotFoundException{
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String querry ="UPDATE employees SET job_title ='Tester', salary = 600000.0 WHERE id = 103";
		  
		  try {
			 	Class.forName("com.mysql.jdbc.Driver");
			 	System.out.println("Drivers loaded successfully!!!");
		  }
		  catch(ClassNotFoundException e) {
			  System.out.println(e.getMessage());
		  }
		  try {
	          Connection con = DriverManager.getConnection(url,username,password);
			  System.out.println("Connection established successfully!!!");
			  Statement stmt= con.createStatement();
			  int rowsaffected=stmt.executeUpdate(querry);
			 
			  if(rowsaffected>0) {
				 System.out.println("update Successfull "+ rowsaffected+" row(s) affected");
			 }else {
				 System.out.println("Updation Failed");
				}
			  
			  stmt.close();
			  con.close();
			  System.out.println("Connection closed successfully");
			  
		  
		    }catch (SQLException e) {
			  System.out.println(e.getMessage());
		  }
	       
		}
}




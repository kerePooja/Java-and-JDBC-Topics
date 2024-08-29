package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DELETEdata {

		 public static void main(String[] args) throws ClassNotFoundException{
			 String url ="jdbc:mysql://localhost:3306/mydatabase";
			 String username = "root";
			 String password = "Shinoy143";
			 String querry ="DELETE FROM employees where id=104";
			  
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
					 System.out.println("Deletion Successfull "+rowsaffected+" rows affected");
				 }else {
					 System.out.println("Deletion Failed");
					}
				  
				  stmt.close();
				  con.close();
				  System.out.println("Connection closed successfully");
				  
			  
			    }catch (SQLException e) {
				  System.out.println(e.getMessage());
			  }
		       
			}

	}



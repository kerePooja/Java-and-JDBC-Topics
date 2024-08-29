package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class INSERTINGdata {

		 public static void main(String[] args) throws ClassNotFoundException{
			 String url ="jdbc:mysql://localhost:3306/mydatabase";
			 String username = "root";
			 String password = "Shinoy143";
			 String querry ="INSERT INTO employees(id,name,job_title,salary)values(104,'Guru','Analyst',30000);";
			  
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
					 System.out.println("Insert Successfull "+rowsaffected+" rows effected");
				 }else {
					 System.out.println("Insertion Failed");
					}
				  
				  stmt.close();
				  con.close();
				  System.out.println("Connection closed successfully");
				  
			  
			    }catch (SQLException e) {
				  System.out.println(e.getMessage());
			  }
		       
			}

		

		

	}


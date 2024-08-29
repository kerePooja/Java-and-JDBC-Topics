package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {

		public static void main(String[] args) throws ClassNotFoundException {
			 
			 String url ="jdbc:mysql://localhost:3306/mydatabase";
			 String username = "root";
			 String password = "Shinoy143";
			  try {
		          Connection con = DriverManager.getConnection(url,username,password);
				  System.out.println("Connection established successfully!!!");
				  con.setAutoCommit(false);
				  Statement statement =con.createStatement();
				  statement.addBatch("INSERT INTO employees(name,job_title,salary)VALUES('Vashu','HR Manager',65000.0)");
				  statement.addBatch("INSERT INTO employees(name,job_title,salary)VALUES('diggy','Manager', 80000.0)");
				  statement.addBatch("INSERT INTO employees(name,job_title,salary)VALUES('appu' ,'dealer', 89000.0)");
				  int[] batchResult = statement.executeBatch();
				  con.commit();
				  System.out.println("batch executed successfully");
				  con.close();
				  System.out.println("Connection closed successfully");
				  
		          }catch (SQLException e) {
				  System.out.println(e.getMessage());
			  }
		       
			}

	}



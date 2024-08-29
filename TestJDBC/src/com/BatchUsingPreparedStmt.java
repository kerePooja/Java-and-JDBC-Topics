package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class BatchUsingPreparedStmt {

	public static void main(String[] args) throws ClassNotFoundException {
		 
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		  try {
	          Connection con = DriverManager.getConnection(url,username,password);
			  System.out.println("Connection established successfully!!!");
			  con.setAutoCommit(false);
			  String query =("INSERT INTO employees(id,name,job_title,salary)VALUES(?,?,?,?)");
			  PreparedStatement preparedstatement =con.prepareStatement(query);
			  Scanner scan = new Scanner(System.in);
			  while(true) {
				  
				 System.out.print("Id: ");
				 int id =scan.nextInt();
				  
				  System.out.print("Name: ");
				  String name=scan.nextLine();
				   
				  System.out.print("job_title: ");
				  String job_title =scan.nextLine();
				  
				  System.out.print("salary: ");
				  double salary=scan.nextDouble();
				  
				  preparedstatement.setInt(1,id);
				  preparedstatement.setString(2,name);
				  preparedstatement.setString(3,job_title);
				  preparedstatement.setDouble(4,salary);
				  preparedstatement.addBatch();
				  System.out.println("Add more values Y/N");
				  String decision=scan.nextLine();
				  if(decision.toUpperCase().equals("N")) {
					  break;
				  }
		     }
			  int[] batchResult = preparedstatement.executeBatch();
		     	con.commit();
		        System.out.println("Batch execute successfully");
			    con.close();
			    scan.close();
			    System.out.println("Connection closed successfully");
			  
	          }catch (SQLException e) {
			  System.out.println(e.getMessage());
		  }
	       
		}

}

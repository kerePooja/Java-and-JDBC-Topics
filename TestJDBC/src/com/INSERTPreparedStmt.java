package com;
import java.sql.*;
import java.sql.PreparedStatement;


public class INSERTPreparedStmt {//to insert the data we worte this pgm

		public static void main(String[] args) throws ClassNotFoundException{
			
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String username ="root";
			String password = "Shinoy143";
			String query = "INSERT INTO employees(id, name ,job_title, salary)VALUES(?,?,?,?)";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Drivers loaded Successfully");
			}
			catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				Connection conn=DriverManager.getConnection(url,username,password);
				System.out.println("connection established Successfully");
				//Statement stmt=conn.createStatement();
				
				PreparedStatement   stmt =conn.prepareStatement(query);
			  	stmt.setInt(1, 105);
			  	stmt.setString(2, "Guru");
			  	stmt.setString(3, "Analyst");
			  	stmt.setDouble(4, 55000.0);
			  	
			  	int rowsaffected=stmt.executeUpdate();
			  	if(rowsaffected>0) {
			  		System.out.println("Data Inserted Successfully!!!");
			  	}
			  	else {
			  		System.out.println("Data Insertion failed");
			  	}
			  			
			 	conn.close();		
				System.out.println();
				System.out.println("connection closed successfully");
				}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}


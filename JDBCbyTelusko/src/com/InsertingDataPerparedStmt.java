package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class InsertingDataPerparedStmt {
	public static void main(String[] args) throws Exception {
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 int id=14;
		 String name="bhagya";
		 String job_title="maid";
		 double salary=20000.0;
		 String query="insert into employees values(?,?,?,?);";
		 
		
		Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("connected Succesfully");
	    
	   	PreparedStatement stmt=con.prepareStatement(query);//prepared statement
	   	stmt.setInt(1,id);
		stmt.setString (2,name);
		stmt.setString (3,job_title);
		stmt.setDouble (4,salary);
	  int rowsaffected=stmt.executeUpdate();//prepared statement
		if(rowsaffected>0) {
			 System.out.println("Insert Successfull "+rowsaffected+" rows effected");
		}else {
			 System.out.println("Insertion Failed");
	    	}
	    
	   	stmt.close();
	   	con.close();

	}
}




package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingTable {

	public static void main(String[] args) throws Exception {
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String query="insert into employees values(13,'Shenoy','maid',20000.0)";
		 
		
		Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("connected Succesfully");
	    
	   	Statement stmt=con.createStatement();
	    int rowsaffected=stmt.executeUpdate(query);
		if(rowsaffected>0) {
			 System.out.println("Insert Successfull "+rowsaffected+" rows effected");
		}else {
			 System.out.println("Insertion Failed");
	    	}
	    
	   	stmt.close();
	   	con.close();

	}
}


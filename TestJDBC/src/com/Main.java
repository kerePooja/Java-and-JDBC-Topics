package com;
import java.sql.*;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException{
	 String url ="jdbc:mysql://localhost:3306/mydatabase";
	 String username = "root";
	 String password = "Shinoy143";
	 String querry ="select * from employees;";
	  
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
		  ResultSet rs=stmt.executeQuery(querry);
		  while(rs.next()) {
			  int id=rs.getInt("id");
			  String name = rs.getString("name");
			  String job_title=rs.getString("job_title");
			  double salary = rs.getDouble("salary");
			  System.out.println("===================");
			  System.out.println("ID: "+id);
			  System.out.println("Name: "+name);
			  System.out.println("job_title: "+job_title);
			  System.out.println("salary: "+salary);
		  }
		  rs.close();
		  stmt.close();
		  con.close();
		  System.out.println("Connection closed successfully");
		  
	  
	    }catch (SQLException e) {
		  System.out.println(e.getMessage());
	  }
       
	}

}

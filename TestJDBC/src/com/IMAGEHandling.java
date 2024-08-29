package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IMAGEHandling {
	public static void main(String[] args) throws ClassNotFoundException{
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String image_path="/Users/poojakere/Downloads/SquarePic_20230127_22465424.jpg";
		 String query="INSERT INTO image_table(image_date) VALUES(?)";  
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
			  FileInputStream fileinputStream = new FileInputStream(image_path);
			  byte[] imageData=new byte[fileinputStream.available()];
			  fileinputStream.read(imageData);//to store img
			  java.sql.PreparedStatement preparedStatement= con.prepareStatement(query);
			  preparedStatement.setBytes(1, imageData);
			  int AffectedRows = preparedStatement.executeUpdate();
			  if(AffectedRows>0){
				  System.out.println("Image Inserted Successfully!!!");
			  }
			  else {
				  System.out.println("Image not Inserted");
			  }
		 
	      }
		  catch (SQLException e)
	      {
	      System.out.println(e.getMessage());
	      }
		  catch (FileNotFoundException e) 
		  {
			e.printStackTrace();
		  } 
		  catch (IOException e) 
		  {
			e.printStackTrace();
		  }
}
}
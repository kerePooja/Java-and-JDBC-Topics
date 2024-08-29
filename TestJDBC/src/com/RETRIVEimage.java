package com;

import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RETRIVEimage {//phm to retrive the image and store in the foder

			public static void main(String[] args) throws ClassNotFoundException{
				 String url ="jdbc:mysql://localhost:3306/mydatabase";
				 String username = "root";
				 String password = "Shinoy143";
				 String Folder_path="/Users/poojakere/Desktop/imag"; 
				 String query="SALECT image_date; FROM image_table where image_id =(?);";
				 
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
					  java.sql.PreparedStatement preparedStatement = con.prepareStatement(query);
					  ((java.sql.PreparedStatement) preparedStatement).setInt(1, 1);
					  ResultSet resultset =((java.sql.PreparedStatement) preparedStatement).executeQuery();
					  if(resultset.next()) {
						  byte[] image_data = resultset.getBytes("image_data");//byte form of image now we have to convert byte into image formate
						  String image_path = Folder_path+"extractedImage.jpg";
						  OutputStream outputStream = new FileOutputStream(image_path);
						  outputStream.write(image_data);
					  }
					  else {
						  System.out.println("Image not found");
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

package com;
	
	import java.sql.*;  
	import java.io.*;  
	public class RetruveImage {
	public static void main(String[] args) throws ClassNotFoundException {  
		 
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String Folder_path="/Users/poojakere/Desktop/imag"; 
		 String query="SALECT image_date; FROM image_table where image_id =(?);";
		
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con=DriverManager.getConnection( url,username,password);  
	      
    java.sql.PreparedStatement ps=con.prepareStatement("select * from img_table");  
	ResultSet rs=((java.sql.PreparedStatement) ps).executeQuery();  
	if(rs.next()){//now on 1st row  
	              
	Blob b=rs.getBlob(2);//2 means 2nd column data  
	byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
	              
	FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");  
	fout.write(barr);  
	              
	fout.close();  
	}//end of if  
	System.out.println("ok");  
	              
	con.close();  
	}catch (Exception e) {e.printStackTrace();  }  
	}  
	}  


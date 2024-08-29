package com;
import java.sql.*;

public class PreparedStatement {//to retrive the data we worte this pgm

	public static void main(String[] args) throws ClassNotFoundException{
		
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String username ="root";
		String password = "Shinoy143";
		String query = "select * from employees where name = ? AND job_title=? ";
		
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
			
			java.sql.PreparedStatement   stmt =conn.prepareStatement(query);
		  	stmt.setString(1, "shamant");
		  	stmt.setString(2, "Tester");
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				String name = resultSet.getString("name");
				String job_title= resultSet.getString("job_title");
				double salary=resultSet.getDouble("salary");
				System.out.println("ID: "+id);
				System.out.println("NAME: "+name);
				System.out.println("JOB TITLE: "+job_title);
				System.out.println("SALARY: "+salary);
			}
			resultSet.close();
			conn.close();
			
			System.out.println();
			System.out.println("connection closed successfully");
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}

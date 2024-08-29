package com;

import java.sql.*;

public class UdamyPreparedStmt {

		public static void main(String[] args) throws ClassNotFoundException {

			Connection myConn = null;
			ResultSet myRs = null;
			
			
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String username ="root";
			String password = "Shinoy143";
			String query="select * from employees where  name=? and  salary=?";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Drivers loaded Successfully");
			}
			catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			try {
				
				// 1. Get a connection to database
				myConn = DriverManager.getConnection(url,username,password);
				System.out.println("connection established Successfully");
				
				// 2. Prepare statement
				java.sql.PreparedStatement myStmt = myConn.prepareStatement(query);
				
				// 3. Set the parameters
				myStmt.setString(1,"pooja" );
				myStmt.setDouble(2,60000.0 );
			
				// 4. Execute SQL query
				myRs = myStmt.executeQuery();
				
				// 5. Display the result result
				while(myRs.next()) {
					int id=myRs.getInt("id");
					String name = myRs.getString("name");
					String job_title= myRs.getString("job_title");
					double salary=myRs.getDouble("salary");
					System.out.println("ID: "+id);
					System.out.println("NAME: "+name);
					System.out.println("JOB TITLE: "+job_title);
					System.out.println("SALARY: "+salary);
				}
				myRs.close();
				myConn.close();
				
				System.out.println();
				System.out.println("connection closed successfully");
			}
			
			catch (Exception exc) {
				System.out.println(exc.getMessage());
				
			}

		}
		
}


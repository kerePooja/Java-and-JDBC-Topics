package com;

import java.sql.*;
import java.sql.PreparedStatement;


public class TransactionManagement {

	public static void main(String[] args) throws ClassNotFoundException {
		 
		 String url ="jdbc:mysql://localhost:3306/mydatabase";
		 String username = "root";
		 String password = "Shinoy143";
		 String withdrawQuery="UPDATE accounts SET balence=balence-? WHERE account_number = ?;";
		 String depositQuery="UPDATE accounts SET balence =balence +? WHERE account_number = ?";
		 

		  try {
	          Connection con = DriverManager.getConnection(url,username,password);
			  System.out.println("Connection established successfully!!!");
			  con.setAutoCommit(false);
			  try {
			 PreparedStatement withdrawstmt= con.prepareStatement(withdrawQuery);
			 PreparedStatement depositestmt= con.prepareStatement(depositQuery);
			  withdrawstmt.setDouble(1, 500.0);
			  withdrawstmt.setString(2, "account456");
			  depositestmt.setDouble(1, 500.0);
			  depositestmt.setString(2, "account4556");
			  
			 int rowsAffectedWithdrawal=withdrawstmt.executeUpdate();
			 int rowsAffectedDeposit= depositestmt.executeUpdate();
			 if(rowsAffectedWithdrawal>0 && rowsAffectedDeposit>0) {
			  con.commit();
			  System.out.println("Transaction Successful!!!");
			 }
			 else{
				 con.rollback();
				  System.out.println("Transaction failed");
				}
				 
			  
		     }catch (SQLException e) {
		      System.out.println(e.getMessage());
		     }
			  con.close();
			  System.out.println("Connection closed successfully");
			  
		  
		    }catch (SQLException e) {
			  System.out.println(e.getMessage());
		  }
	       
		}

	}

package com.gces.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws NullPointerException {	
		
		String sql = "SELECT * FROM `employees`";
		
		try 
		{
				// Load and register driver.
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver Class Name
				// Establish connection between apps and database.
			Connection connectionObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/gces","root","");
				// Creation of Statement Object
			Statement statementObject = connectionObject.createStatement();
				// Send and execute SQL Query
			ResultSet rs = statementObject.executeQuery(sql);
				// Process Result from ResultSet
			while(rs.next()) {
				System.out.println("ID : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Address : " + rs.getString(3));
				System.out.println("Salary : " + rs.getFloat(4));
			}
				// Close Connection
			connectionObject.close();				
		}
		catch(SQLException exc)
		{
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc)
		{
			exc.printStackTrace();
		}
	}
}

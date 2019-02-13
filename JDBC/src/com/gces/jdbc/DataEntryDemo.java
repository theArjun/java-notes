package com.gces.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataEntryDemo {
	
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDB_URL = "jdbc:mysql://localhost:3306/gces";

	public static void main(String[] args) throws NullPointerException {
		
		DataEntry dataOne = new DataEntry("Arjun Adhikari", "Mountain View, CA, United States", 3122324.0F);
		
		String insertQuery = "INSERT INTO `employees` ( `username`, `address`, `salary`)" + " VALUES (?, ?, ?)";
		String displayQuery = "SELECT * FROM `employees`";
		try
		{
			// Load and register driver.
			Class.forName(JDBC_DRIVER);
			
			// Establish connection between app and database
			Connection connectionObject = DriverManager.getConnection(JDB_URL,"root","");
			
			// Creation of Statement Object
			PreparedStatement pst = connectionObject.prepareStatement(insertQuery);
			
			// Run and execute SQL Query
			pst.setString(1, dataOne.name);
			pst.setString(2, dataOne.address);
			pst.setFloat(3, dataOne.salary);
			pst.executeUpdate();

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

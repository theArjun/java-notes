package com.gces.jdbc;
import java.sql.*;

public class DeleteData {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDB_URL = "jdbc:mysql://localhost:3306/gces";

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(JDB_URL,"root",""); 
		Statement st = con.createStatement();
		
		String sql = "DELETE FROM `students` WHERE `id` < 3";
		
		int deletion = st.executeUpdate(sql);
		if(deletion > 0) {
			System.out.println("Deleted Successfully.");
		}
		else
		{
			System.out.println("Error while deleting.");
		}
		st.close();
		con.close();
	}
}

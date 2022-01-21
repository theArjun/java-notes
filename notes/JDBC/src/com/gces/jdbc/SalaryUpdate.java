package com.gces.jdbc;
import java.sql.*;

public class SalaryUpdate {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDB_URL = "jdbc:mysql://localhost:3306/gces";

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String sql = "UPDATE `employee` SET `salary` = 50000 WHERE `post` = 'Manager'";
		
		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(JDB_URL,"root","");
		Statement st = con.createStatement();
		int updation = st.executeUpdate(sql);
		if(updation > 0) {
			System.out.println("Updated Successfully");
		}
		else
		{
			System.out.println("Can't update.");
		}
		
		st.close();
		con.close();
	}

}

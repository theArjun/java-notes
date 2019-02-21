package com.gces.jdbc;
import java.sql.*;

public class Students {

	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDB_URL = "jdbc:mysql://localhost:3306/gces";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(JDB_URL,"root","");
		String sql = "SELECT * FROM `students` WHERE `id` < 3";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("Name : "+ rs.getString(2));
			System.out.println("Address : "+ rs.getString(3));
			System.out.println("DOB : "+ rs.getString(4));
			System.out.println("Class : "+ rs.getString(5));
		}
		st.close();
		con.close();
	}

}

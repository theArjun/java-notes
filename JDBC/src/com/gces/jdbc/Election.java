package com.input.data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Election {
	
	public static final String JDBC_DRIVER  = "com.mysql.cj.jdbc.Driver";
	public static final String JDB_URL = "jdbc:mysql://localhost:3306/gces";
	String sql;
	
	public Election() throws ClassNotFoundException, SQLException{
		sql = "CREATE TABLE IF NOT EXISTS `student`("
				+ "id INT PRIMARY KEY AUTO_INCREMENT,"
				+ "name VARCHAR(32) NOT NULL,"
				+ "age INT(2) NOT NULL"
				+ ")";
		
		Class.forName(JDBC_DRIVER);
		Connection con = DriverManager.getConnection(JDB_URL,"root","");
		Statement st = con.createStatement();
		int databaseCreated = st.executeUpdate(sql);
		System.out.println("Database Creation : " + databaseCreated);
		
		sql = String.format("INSERT INTO `student`(`name`, `age`) VALUES ('%s', '%d')", "Hari", 19);
		int databaseUpdated = st.executeUpdate(sql);
		System.out.println("Database Updation : " + databaseUpdated);
		st.close();
		con.close();		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Election();
	}

}

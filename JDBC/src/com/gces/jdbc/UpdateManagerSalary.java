package com.gces.jdbc;

import java.sql.*;

public class UpdateManagerSalary {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String JDB_URL = "jdbc:mysql://localhost:3306/testdb";

    public static void main(String[] args) {

        String updateQuery = "UPDATE employee SET SALARY = 50000 WHERE post LIKE '%Manager'";

        try {

        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNOtFoundException exc) {

        }
    }
}

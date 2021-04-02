# Steps to Develop JDBC Application

![Steps](https://www.javatpoint.com/java/new/images/java-database-connectivity-steps.jpg)

1. Load and Register driver class.  
```Class.forName("Oracle.jdbc.OracleDriver");```

2. Establish Conection  
```Connection con = Driver.Manager.getConnection( url , DbUsername , DbPassword )  ;```
3.  Creation of statement Object   
    ``` Statement st = con.createStatement(); ```
4. Send and Execute SQL Query  
    ``` Result rs = st.executeQuery("Select * from employees");```
5. Process Result from ResultSet  
       
        while(rs.next())
        {
            System.out.Println(rs.getInt(1));
        }

6. Close connection
    ```con.close();```

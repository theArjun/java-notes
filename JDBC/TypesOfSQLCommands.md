# Types of SQL Commands

1. **DDL**(Data Definition Language)  
```CREATE TABLE, ALTER, DROP```
2. **DQL**(Data Query Language)  
```SELECT```
3. **DCL**(Data Control Language)  
```ALTER, PASSWORD, GRANT ACCESS```
4. **DML**(Data Manipulation Language)  
```INSERT, DELETE, UPDATE```
5. (Data Administration)  
```START AUDIT```
6. (Data Transaction)  
```COMMIT, ROLLBACK, SAVEPOINT```

## What should I know as Java Developer ?

### Select Queries(**DQL**) 
> Returns Result Set

### Non-Select Queries(**DML**)
> Returns Numeric Value

## Methods to Execute **SQL** Query
1. ```executeQuery()```
- To execute ```SELECT``` queries.

        public result executeQuery(String sqlQuery) throws SQLException
Eg:

        Result rs = st.executeQuery("SELECT * FROM employess");
        while(rs.next()){
            System.out.println(" ID : " rs.getInt(1));
        }

2. ```executeUpdate()```
- Applicable for non-select operation(DML)
```public int executeUpdate(String sqlQuery) throws SQLException``` 

Eg:

        int affectedRow = st.executeUpdate("INSERT INTO employees(`id`) VALUES ('1')");
Returns the afftected rows.

3. ```execute()```
- For both ```SELECT``` and NON-```SELECT``` operations.
- If you don't know ```SQL``` query until run-time, we can use execute().
- Return type => ```boolean```  
 -> True - ```SELECT``` Query  
 -> false - Non-```SELECT``` Query  
 ```public boolean execute (String query) throws SQLException```


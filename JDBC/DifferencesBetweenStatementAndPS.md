# Difference between Statement and Prepared Statement

| Statement | Prepared Statement |
|-----------|--------------------|
| At the time of creating Statement object, we are not required to provide any query | At the time of creating Prepared Object, we have to provide SQL Query compulsary which can be send to the database and will be compiled. |
| ```Statemnt st = con.createStatement();``` | ```PreparedStatement pst = con.prepareStatement(query);``` |
| Hence, Statement object is not associated with any query and we can use for multiple queries. | Hence, Prepared Statement is associated with any query. |
| Whenever, we are using execute method, everytime query will be compiled. | Whenever, we are using execute method, query won't be compiled every time. |
| Statement object can work only for static queries. | Work for Static and Dynamic Queries |
| Relatively, performance is low. | Relatively, performance is high. |
| Chance of SQL Injection | No Chance of SQL Injection |
| Inserting data value and large object is difficult. | Insering data value and large object is easy. |
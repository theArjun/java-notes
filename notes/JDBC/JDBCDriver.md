# JDBC Driver

- While communicating with database, we have to connect java calls into database specific calls and database specific calls into java cells.  For this Driver software is required.
- As per our analogy, driver software is a translator.

> Progress Direct Software Company introduced Type-5 driver but is not industry standard driver.

## Types of JDBC Driver
1. Type 1 Driver (JDBC-ODBC Bridge Driver)
2. Type 2 Driver (Native API-Partly Driver or Native Driver)
3. Type 3 Driver (All Java Net Protocol Driver or Network Protocol Driver or Middleware Driver)
4. Type 4 Driver (Pure Java Driver or Native Protocol or Thin Driver)

### Type 1 Driver
> ODBC Supports all programming languages.

![Driver 1](https://way2java.com/wp-content/uploads/2013/11/image6.png)

### Type 2 Driver
> Written in C, C++

![Driver 2](https://2.bp.blogspot.com/-nvGkcCjx-tA/U-mmHyr2B5I/AAAAAAAACgg/rUIumINbfRU/s1600/Type+2+JDBC+Driver+-++Native-API+driver.jpg)

### Type 3 Driver
>Three tiers

![Driver 3](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Network_Protocol_driver.png/300px-Network_Protocol_driver.png)

### Type 4 Driver

![Driver 4](https://www.javaken.com/java_images/jdbc_type4_driver.jpg)

## Thick vs Thin Driver

> See in copy.

## Comparision

| Property | Type 1 | Type 2 | Type 3 | Type 4 |
|-----------|--------|-------|---------|--------|
| Conversion | From JDBC Calls to  ODBC Call | From JDBC Calls to Native Library Call  | From JDBC Calls to Middleware Server Call  |  From JDBC Calls to Database specific Call |
| Implemented In | Only Java  |  Java and Native Langiages like C, C++  |  Only Java  | Only Java |
| Architecture | 2 Tier  | 2 Tier  | 3 Tier  | 2 Tier  |
| Platform Independent | No  | No  | Yes  | Yes  |
| Database Independent |  Yes | No  | Yes  | No  |
| Thick or Thin |  Thick | Thick  | Thick  |  Thin |
| Also Known As | JDBC-ODBC Bridge Driver  | Native API-Partly Driver or Native Driver  |  All Java Net Protocol Driver or Network Protocol Driver or Middleware Driver | Pure Java Driver or Native Protocol or Thin Driver  |
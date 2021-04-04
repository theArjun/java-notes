# Socket Programming
- Java Socket Programming is used for communication between the application running on different machine.
- Java Socket Programming support :  
  
|  Connection Oriented | Connection-Less |
|-----------------------|-----------------|
| Classes Used : | Classes Used : |
| 1. ```Socket```  | 1. ```DatagramSocket``` |
| 2. ```ServerSocket```  | 2. ```DatagramPacket``` |

  Client in socket programming must know :
- IP Adress

|Socket Class|ServerSocket Class|        
|-|-|        
|This method is used to create a socket.|This class is used to create a ServerSocket.|        
|**Methods**|**Methods**|
|- ```public InputStream getInputStream()```|- ```public Socket accept()```|     
|- ```public OutputStream getOutputStream()```|- ```public synchronized void close()```|        
|- ```public synchronized void close()```||        


## Implementation
```java
{% include 'networking/SocketProgramming/TryWithResources.java' %}
```


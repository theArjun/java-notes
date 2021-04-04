# InetAddress Class
- InetAddress represents an IP address.
- ```java.net.InetAddress``` class provides methods to get the IP of any hostname(eg : facebook.com);
 
##  Methods 
1. ```public static InetAddress getByName(String host) throws UnknownHostException```
2. ```public static InetAddress getLocalHost() throws UnknownHostException```
3. ```public static InetAddress getHostName() throws UnknownHostException```
- Rturns hostname of IP Address.
4. ```public static InetAddress getHostAddress() throws UnknownHostException```
5. ```String toString()```
- Converts IP Address to a String

## Implementation
```java
{% include 'networking/InetAddress/InetAddressDemo.java' %}
```


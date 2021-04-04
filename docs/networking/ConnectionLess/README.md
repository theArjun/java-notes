# Connection Less
        1. Datagram Socket Class
        2. Datagram Packet Class

## DatagramSocket Class

- This class represents a connection-less socket for sending and receiving datagram packets.
- A datagram is basically an information but there is no guarantee of its content, arrival or arrival time.

### Constructor

1. ```DatagramSocket()``` throws ```SocketException```;
- It creates a datagram socket and binds it with the available Port number on Local Machine. 

2. ```DatagramSocket(int port)``` throws ```SocketException```;
- It creates a datagram socket and binds it with the given port number.

3. ```Datagram(int port, InetAddress address)``` throws ```SocketException```;
 - It binds with the specified port and host address.

## DatagramPacket Class

 - DatagramPacket is a message that can be sent or received. If you send multiple packet, it may arrive in any order. Additionally, packet delivery is not guaranteed.

### Constructor

 1. ```DatagramPacket(byte[] byteArray, int length)```
 - It creates a datagram packet to recieve the packets.
 2. ```DatagramPacket(byte[] byteArray, InetAddress address int length)```
 - It is used to send the packets.


## Sender Implementation
```java
{% include 'networking/ConnectionLess/Sender.java' %}
```

## Receiver Implementation
```java
{% include 'networking/ConnectionLess/Receiver.java' %}
```

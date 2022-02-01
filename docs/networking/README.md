# Network Programming
        1. Socket Programming
        2. URL Processing

- A Network is a collection of devices that share a common communication protocol and connected with some communication medium.
- A protocol defines a set of rules to which all the communicating parties adhere to (agree).
- The ```java.net``` package was designed with a group of classes and interfaces which not only provide low level but also hight level communication details.
- ```java.net``` package provides support for the two common network protocols.
  1. TCP (Transmission Control Protocol)
  2. UDP(User Datagram Protocol)
- The term network programming refers to writing programs, then execute across multiple devices, in which the devices are all connected to each other using a network.

## Differences between TCP and UDP
|TRANSMISSION CONTROL PROTOCOL (TCP)	| USER DATAGRAM PROTOCOL (UDP)|
|----------------------------------------|-----------------------------|
|1. TCP is a connection-oriented protocol. Connection-orientation means that the communicating devices should establish a connection before transmitting data and should close the connection after transmitting the data.|1.	UDP is the Datagram oriented protocol. This is because there is no overhead for opening a connection, maintaining a connection, and terminating a connection. UDP is efficient for broadcast and multicast type of network transmission.|
|2. TCP is reliable as it guarantees delivery of data to the destination router.| 2. The delivery of data to the destination cannot be guaranteed in UDP.|
|3.TCP provides extensive error checking mechanisms. It is because it provides flow control and acknowledgment of data.|3.	UDP has only the basic error checking mechanism using checksums.|
|4. Sequencing of data is a feature of Transmission Control Protocol (TCP). this means that packets arrive in-order at the receiver.|4.	There is no sequencing of data in UDP. If ordering is required, it has to be managed by the application layer.|
|5. TCP is comparatively slower than UDP.|5.	UDP is faster, simpler and more efficient than TCP.|
|6.Retransmission of lost packets is possible in TCP, but not in UDP.|	6.There is no retransmission of lost packets in User Datagram Protocol (UDP).|
|7.TCP has a (20-80) bytes variable length header.|7.	UDP has a 8 bytes fixed length header.|
|8.TCP is heavy-weight.|8. UDP is lightweight.|
|9.TCP doesn’t supports Broadcasting.|9.	UDP supports Broadcasting.|

## Some Terminologies

1. IP Address
- It is a logical address that can be changed. IP Address are 32-bit number (IPv4 format) often represented as a quad of four 8-bit numbers separated by periods.  
  Eg : ```192.168.0.1```

2. Protocol
- It is a set of rules basically that is followed for communication.  
Eg: TCP, UDP, FTP, POP, SMTP, HTTP, HTTPS

3. Port Number
- The port number is used to uniquely identify different applications. It acts as a communication end point between applications.
- The valid port number range from 1 - 65535.
The ports upto 1023 are reserved for well known services and hence are well-known ports.  
Eg: 80  for ```HTTP```, 21 for ```FTP```, 22 for ```SSH```

4. Socket
- A socket is a end point between two way communication.
- It defines a network connection as a Stream from which bytes can be read and similarly bytes can be sent.
- Java socket can be used to provide both connection-oriented (```TCP```) as well as connectionless (```UDP```).


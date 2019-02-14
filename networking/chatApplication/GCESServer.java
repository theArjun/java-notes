import java.io.*;
import java.net.*;

class GCESServer {
    public static void main(String[] args) throws IOException{
        
        // Step 1: First, server should instatiate ServerSocket object.
        ServerSocket ss = new ServerSocket(6666);

        // Step 2 : Then, Server object envokes accept() method of ServerSocket class. This waits for client until client creates Socket object.
        Socket s = ss.accept();

        // This gets the message sent by the client.
        DataInputStream dis =  new DataInputStream(s.getInputStream());

        // Typehinting the UTF message into string.
        String message = (String)dis.readUTF();

        System.out.println("Message from client : " + message);
        ss.close();
    }
}
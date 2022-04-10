import java.io.*;
import java.net.*;

class Server {
    public static void main(String[] args) throws IOException{
        
        // Step 1: First, server should instatiate ServerSocket object.
        ServerSocket ss = new ServerSocket(6666);

        // Step 2 : Then, Server object envokes accept() method of ServerSocket class. This waits for client until client creates Socket object.
        Socket s = ss.accept();

        DataInputStream dis =  new DataInputStream(s.getInputStream());

        // Typehinting the UTF message into string.
        String message = (String)dis.readUTF();

        int num = Integer.valueOf(message);
        

        int snum = num * num;


        // This gets the message sent by the client.
        DataOutputStream dout =  new DataOutputStream(s.getOutputStream());

        dout.writeUTF("" + snum);
        dout.flush();
        dout.close();
        ss.close();
    }
}

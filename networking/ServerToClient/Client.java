import java.io.*;
import java.net.*;

class Client {
    public static void main(String[] args) throws IOException{

        Socket s = new Socket ("localhost",6666);

        DataInputStream dis =  new DataInputStream(s.getInputStream());

        // Typehinting the UTF message into string.
        String message = (String)dis.readUTF();

        System.out.println("Message from Server : " + message);
        s.close();
    }    
}
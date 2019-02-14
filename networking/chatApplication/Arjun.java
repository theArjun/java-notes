import java.net.*;
import java.io.*;

class Arjun {
    public static void main(String[] args) throws IOException{
        /* Let's use port 6666 for example. */
        Socket s = new Socket("localhost",6666);
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        // Writes the message in UTF Format.
        dout.writeUTF("Hello, my Name is Arjun. Can I know information about my attendance status ?");
        dout.flush();
        dout.close();
        s.close();
    }
}
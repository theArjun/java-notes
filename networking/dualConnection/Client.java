import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client {
    public static void main(String[] args) throws IOException{

        Socket s = new Socket ("localhost",6666);

        System.out.println("Enter a number  : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        DataOutputStream dout =  new DataOutputStream(s.getOutputStream());

        dout.writeUTF("" + num);
    
        DataInputStream dis =  new DataInputStream(s.getInputStream());

        // Typehinting the UTF message into string.
        String message = (String)dis.readUTF();

        System.out.println("Square  : " + message);
        s.close();
    }    
}

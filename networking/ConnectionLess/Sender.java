import java.io.*;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(6666);
        String str = "Welcome Java";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), 3000);

        ds.send(dp);
        ds.close();
    }
}
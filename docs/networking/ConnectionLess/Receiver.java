import java.io.IOException;
import java.net.*;

public class Receiver {
    public static void main(String[] args) throws IOException{
        
        DatagramSocket ds = new DatagramSocket(6666);

        byte[] buf = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);

        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
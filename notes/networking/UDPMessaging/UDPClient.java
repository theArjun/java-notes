import java.net.*;

public class UDPClient {

    private static final int port = 9999;

    public static void main(String[] args) throws Exception {

        // In client, port number isn't necessary in DatagramSocket.
        DatagramSocket ds = new DatagramSocket();

        String msg = "Hello Server !";

        // String is needed to be converted to bytes array.
        byte[] msgByteArray = msg.getBytes();

        // As I'm testing on my own system, I am referring to localhost.
        InetAddress address = InetAddress.getLocalHost();

        // At sender side, DatagramPacket accepts four parameters while sending :
        // i. byte array of message
        // ii. length of byte array
        // iii. IP address
        // iv. Port number
        DatagramPacket dp = new DatagramPacket(msgByteArray, msgByteArray.length, address, port);
        ds.send(dp);

        ds.close();
    }
}
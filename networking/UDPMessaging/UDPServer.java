import java.net.*;

public class UDPServer {

    private static final int port = 9999;

    public static void main(String[] args) throws Exception {

        // In server, port number is essential.
        DatagramSocket ds = new DatagramSocket(port);

        // We are assigning the message into the empty byte array.
        byte[] emptybyteArray = new byte[1024];

        // At receiving side, DatagramPacket accepts two parameters only.
        // i. Empty byte array
        // ii. Length of empty byte array
        DatagramPacket dp = new DatagramPacket(emptybyteArray, emptybyteArray.length);

        ds.receive(dp);

        // As the received message is in bytes, we need to convert into String.
        // Second and third parameter in String constructor limit the message upto the
        // given length only.
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Message : " + msg);

        ds.close();
    }
}
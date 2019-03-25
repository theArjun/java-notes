/* This program checks whether your device is connected to Internet or not. */

import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author arjun
 */
public class IsInternetAvailable {
    public static void main(String[] args) {
        Socket sock = new Socket() ;
        InetSocketAddress address = new InetSocketAddress("www.thearjun.tech", 80);
        try{
            sock.connect(address, 3000);
            System.out.println("Active Internet Connection");
            sock.close();
        }
        catch(Exception exc) {
            System.out.println("No Internet Connection");
        }
        
    }
    
}

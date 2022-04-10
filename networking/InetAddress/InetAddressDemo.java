import java.net.*;

class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Address : " + address);

        address = InetAddress.getByName("www.thearjun.tech");
        System.out.println("Address : " + address);

        /*
         * On the Internet, it is common for a single name to be used to represent
         * several machines. In the world of web servers, this is one way to provide
         * some degree of scaling. The getAllByName( ) factory method returns an array
         * of InetAddresses that represent all of the addresses that a particular name
         * resolves to. It will also throw an UnknownHostException if it can’t resolve
         * the name to at least one address.
         */

        InetAddress[] addresses = InetAddress.getAllByName("www.thearjun.tech");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println("Address " + (i + 1) + " : " + addresses[i]);
        }

        /* Instance Methods */

        System.out.println("Host Name : " + address.getHostName());
        System.out.println("Host Address : " + address.getHostAddress());

    }
}
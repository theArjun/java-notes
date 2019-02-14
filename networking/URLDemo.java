import java.net.*;

class URLDemo {

    public static void main(String[] args) throws MalformedURLException {

        URL obj = new URL("http://www.thearjun.tech:80/index.htm");
        System.out.println("Protocol : " + obj.getProtocol());
        System.out.println("Hostname : " + obj.getHost());
        System.out.println("Port : " + obj.getPort());
        System.out.println("File Hosted : " + obj.getFile());
    }
}
import java.io.*;
import java.net.*;
import java.util.Date;

class URLConnectionDemo {

    public static void main(String[] args) throws MalformedURLException {

        try {
            URL url = new URL("http://www.internic.net");

            URLConnection urlconn = url.openConnection();

            System.out.println("Content Length : " + urlconn.getContentLength()); // Returns -1 if unavailable.

            long d = urlconn.getDate(); // Returns 0 if unavailable
            System.out.println("Date : " + d);

            System.out.println("Content Type : " + urlconn.getContentType());

            // get expiration date
            d = urlconn.getExpiration();
            if(d==0)
            System.out.println("No expiration information.");
            else
            System.out.println("Expires: " + new Date(d));

            // get last-modified date
            d = urlconn.getLastModified();
            if(d==0)
            System.out.println("No last-modified information.");
            else
            System.out.println("Last-Modified: " + new Date(d));  
            
            // get content length
            long len = urlconn.getContentLengthLong();
            if(len == -1)
            System.out.println("Content length unavailable.");
            else
            System.out.println("Content-Length: " + len);

            InputStream is = urlconn.getInputStream(); // Returns an InputStream that is linked to the resource. This
                                                       // stream can be used to obtain the content of the resource. It
                                                       // throws IOException.

            int inputChar;

            while ((inputChar = is.read()) != -1) {
                System.out.print((char) inputChar);
            }

            is.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }

    }
}
import java.io.FileReader; 
import java.io.IOException;
import java.io.BufferedReader;

class GCES {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("gces.txt"));
            int i = br.read(); // Reads the character and stores in integer value - Unicode
            while (i != -1) { // Denotes no character
                System.out.print((char) i); // Type hinting
                i = br.read(); // Iteratively reads the character one by one until loop terminates.
            }
            br.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
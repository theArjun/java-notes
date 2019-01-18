import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

class GCES {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("gces.txt"));
            String line = br.readLine(); 
            while (line != null) { // Denotes no character
                bw.write(line);
                bw.newLine();
                line = br.readLine(); // Iteratively reads the line one by one until loop terminates.
            }
            br.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}

// System.out.print(line+"\n"); // For only printing lines in console
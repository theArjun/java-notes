import java.io.*;

class MergeFiles{
    public static void main(String[] args)throws IOException{
        try{
            PrintWriter pw = new PrintWriter(new File("finalText.txt"));
            BufferedReader brOne = new BufferedReader(new FileReader("abc.txt"));
            BufferedReader brTwo = new BufferedReader(new FileReader("xyz.txt"));
            String lineOne = brOne.readLine();
            String lineTwo = brTwo.readLine();
            while (lineOne != null || lineTwo != null) { // Denotes no character
                pw.write(lineOne+"\n");
                pw.write(lineTwo+"\n");
                lineOne = brOne.readLine(); // Iteratively reads the line one by one until loop terminates.
                lineTwo = brTwo.readLine();
            }

            pw.flush();
            pw.close();
            brOne.close();
            brTwo.close();
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
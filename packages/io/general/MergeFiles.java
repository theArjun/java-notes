import java.io.*;

class MergeFiles{
    public static void main(String[] args)throws IOException{
        try{
            PrintWriter pw = new PrintWriter(new File("finalText.txt"));
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
            String line = br.readLine();
            while (line != null ) { // Denotes no character
                pw.write(line+"\n");
                line = br.readLine(); // Iteratively reads the line one by one until loop terminates.
            }

            br = new BufferedReader(new FileReader("xyz.txt"));
            line = br.readLine();
            while (line != null) { // Denotes no character
                pw.write(line + "\n");
                line = br.readLine(); // Iteratively reads the line one by one until loop terminates.
            }

            pw.flush();
            pw.close();
            br.close();
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
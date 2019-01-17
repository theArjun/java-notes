import java.io.*;

class GCES{
    public static void main(String[] args){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("gces.txt"));
            bw.write("gces");
            bw.newLine();
            bw.write("2019");
            bw.newLine();
            bw.write("Happy New Year");
            bw.flush();
            bw.close();
        }catch(IOException error){
            error.printStackTrace();
        }

    }
}
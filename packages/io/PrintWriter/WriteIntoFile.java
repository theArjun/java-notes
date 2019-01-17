import java.io.*;

class Sample {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("abc.txt");
            pw.print('d'); // Writes character
            pw.print(100 + "\n"); // Writes integer
            pw.print(true+"\n"); // Writes boolean
            pw.print('c'+"\n"); // Writes Character
            pw.print("gces"+"\n"); // Writes string
            pw.flush();
            pw.close();
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
import java.io.*;

class FileReaderDemo{
    public static void main(String[] args){
        try{
            // Method : int read(char[] ch)
            File f = new File("myText.txt");
            // Dynamically allocating the size of the array according to the text length inside file.
            char[] ch = new char[(int)f.length()];
            FileReader fr = new FileReader(f);
            fr.read(ch);
            // Assigns each character into another character variable.
            for(char ch1:ch){
            	System.out.print(ch1);
            }
            fr.close();
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
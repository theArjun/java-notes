/* Write a program to read content from file abc.txt and store it in xyz.txt. */

import java.io.*;

class DataTransfer
{
    public static void main(String[] args)
    {
        try
        {
            FileReader filereader = new FileReader("abc.txt");
            FileWriter filewriter = new FileWriter("xyz.txt");
            
            int i = filereader.read();
            while(i != -1)
            {
                System.out.print((char)i);
                filewriter.write(i); // Appends every time
                i = filereader.read();
            }
            filereader.close();
            filewriter.flush();
            filewriter.close();
        }
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
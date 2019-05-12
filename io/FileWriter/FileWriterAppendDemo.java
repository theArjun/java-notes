import java.io.*;

class FileWriterAppendDemo{
	public static void  main(String[] args){
		try{
			// Appends
			FileWriter fw = new FileWriter("abc.txt",true);
			
			fw.write("\n Arjun");
			fw.flush();
			fw.close();
		}catch(IOException error ){
			error.printStackTrace();
		}
	}
}
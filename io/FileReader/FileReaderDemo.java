import java.io.FileReader;
import java.io.IOException;


class FileReaderDemo{

	// Method : int read()
	public static void main(String[] args){
		try{
			FileReader fr  = new FileReader("myText.txt");
			int i = fr.read();
			while(i != -1){ // Denotes no character
				System.out.print((char)i); // Type-hinting
				i = fr.read();
			}
			fr.close();
		}catch(IOException error){
			error.printStackTrace();
		}
	}	
}
import java.io.*;

class FileWriterDemo{
	public static void  main(String[] args){
		try{
			FileWriter fw = new FileWriter("abc.txt");
			fw.write(100);
			fw.write("abc \n Software");
			// Paragraph Break
			fw.write('\n');
			// Character Array
			char[] ch = {'a','b','c'};
			// Writing character array
			fw.write(ch);
			fw.write('\n');
			fw.flush();
			fw.close();
		}catch(IOException error ){
			error.printStackTrace();
		}
	}
}
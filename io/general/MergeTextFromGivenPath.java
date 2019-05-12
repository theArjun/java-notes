import java.io.*;
class DisplayTextFiles {
	public static void main(String[] args) throws IOException {
		BufferedReader br; // Declaring a variable of BufferedReader data type so that it can be used inside loop to read every .txt files listed there.
		String path = "C:/users/arjun/Desktop/"; // This is pre-specified path, you can change it.
		PrintWriter pw = new PrintWriter(path + "mergedText.txt");
		String line; // This will get the lines on text files.
		String location;
		File[] filesFromPath = (new File(path)).listFiles();

		for (File fileFromPath : filesFromPath) {
			if (fileFromPath.getName().endsWith(".txt") && !fileFromPath.getName().equals("mergedText.txt")) { // First getName() will return the file name into string and endsWith() checks the file extension like REGEX. It excludes the mergedText.txt too.
				System.out.println("Reading from " + fileFromPath.getName()); // Prints progress message in console.
				location = path + fileFromPath.getName();
				br = new BufferedReader(new FileReader(location));
				pw.write("From " + fileFromPath.getName() + "\n"); // This will write the text.
				line = br.readLine(); // Reads a line from specified file and returns string.
				while (line != null) { // Loop executes until the line-read is not null.
					pw.println(line + "\n"); // Writes each lines into the PrintWriter variable.
					line = br.readLine();
				}
				pw.write("\n");
			}
		}
		System.out.println("Writing completed.");
		// br is not initialized at this scope, so need to close() it.
		pw.flush();
		pw.close();
	}
}
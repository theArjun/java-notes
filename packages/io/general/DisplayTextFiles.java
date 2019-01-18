import java.io.*;

class DisplayTextFiles {
    public static void main(String[] args) throws IOException {
        String path = "C:/users/arjun/Desktop";
        File[] filesFromPath = (new File(path)).listFiles();
        for (File fileFromPath : filesFromPath) {

            if (fileFromPath.getName().endsWith(".txt")) { // First getName() will return the file name into string and endsWith() checks the file extension like REGEX.
                System.out.println(fileFromPath.getName()); // Prints all txt files in Desktop.
            }
        }
    }
}
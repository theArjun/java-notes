import java.io.File;

class CountsFile{
    private static int count; // Count variable to count the no of files.
    public static void count(){
        count++; // Every time the method is envoked, count increases by 1.
    }
    public static int getCount(){
        return count; // Getter for count.
    }

    public static void main(String[] args){
        try{
            File fileObjectOne = new File("C:\\users\\arjun\\Desktop\\workspace\\Java\\packages\\io\\File"); // My directory structure.
            System.out.println("Is this directory : "+fileObjectOne.isDirectory()); // Checks the given path is folder or not and returns boolean value.

            File[] thisDirectory = fileObjectOne.listFiles(); // Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname. If this abstract pathname does not denote a directory, then this method returns null. 
            for(File thisDir:thisDirectory){
                if(thisDir.isFile()){ // Tests whether the file denoted by this abstract pathname is a normal file. A file is normal if it is not a directory and, in addition, satisfies other system-dependent criteria. Any non-directory file created by a Java application is guaranteed to be a normal file.
                    System.out.println(">> "+thisDir.getName()); // Returns the name of the file or directory denoted by this abstract pathname. This is just the last name in the pathname's name sequence. If the pathname's name sequence is empty, then the empty string is returned.
                    count();
                }
            }
        }catch(Exception error){
            error.printStackTrace();
        }finally{
            System.out.println("Total no of files : "+getCount());
        }
    }
}
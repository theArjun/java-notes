import java.io.File;
import java.io.IOException;

class MyFile{
    public static void main(String[] args){
        File folderObjectOne = new File("C:\\users\\arjun\\Desktop\\gces");
        folderObjectOne.mkdir();
        if(!folderObjectOne.exists()){
            System.out.println("GCES Folder creation unsuccessful.");
        }else{
            System.out.println("GCES Folder created successfully.");
        } 
        File folderObjectTwo = new File("C:\\users\\arjun\\Desktop\\gces\\io");
        folderObjectTwo.mkdir();
        if(!folderObjectTwo.exists()){
            System.out.println("io Folder creation unsuccessful.");
        }else{
            System.out.println("io Folder created successfully.");
        } 

        // Now we are creating the file

        File fileObjectOne = null;
        boolean bool = false;
        try{
            fileObjectOne = new File("C:\\users\\arjun\\Desktop\\gces\\io\\myTextFile.txt");
            bool = fileObjectOne.createNewFile(); // If created; returns true value to bool.
            System.out.println("File created : "+bool); 
            fileObjectOne.delete(); // Deletes the file.
            if(!fileObjectOne.createNewFile()){
                System.out.println("Error while creating new file.");
            }
        }catch(IOException error){
            error.printStackTrace(); // Prints error; it may throw IOException.
        }        
    }
}
import java.io.File;
import java.io.IOException;

class MyFile{
    public static void main(String[] args){
        try{
            File folderObjectOne = new File("C:\\users\\arjun\\Desktop\\gces");
            if(!folderObjectOne.exists()){
                if(folderObjectOne.mkdir()){
                    System.out.println("Folder created successfully.");
                }else{
                    System.out.println("Failed to create folder.");
                }
            }
            File folderObjectTwo = new File("C:\\users\\arjun\\Desktop\\gces\\io");
            if(!folderObjectTwo.exists()){
                if(folderObjectTwo.mkdir()){
                    System.out.println("Folder created successfully.");
                }else{
                    System.out.println("Failed to create folder.");
                }
            }
            File fileObjectOne = new File("C:\\users\\arjun\\Desktop\\gces\\io\\myTextFile.txt");
            if(!fileObjectOne.exists()){
                if(fileObjectOne.createNewFile()){
                    System.out.println("File created successfully.");
                }else{
                    System.out.println("Failed to create file.");
                }
            }
        }catch(IOException error){
            error.printStackTrace();
        }     
    }
}
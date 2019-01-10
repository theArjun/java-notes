import java.io.File;

class DisplayAll{
    public static void main(String[] args){
        try{
            File fileObjectOne = new File("C:\\users\\arjun\\Desktop\\"); 

            File[] thisDirectory = fileObjectOne.listFiles();
            System.out.println("\nYou're in : "+fileObjectOne.getAbsolutePath()+"\n"); 
            for(File thisDir:thisDirectory){
                if(thisDir.isFile() || thisDir.isDirectory()){ 
                    System.out.println(">> "+thisDir.getName());
                }
            }
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
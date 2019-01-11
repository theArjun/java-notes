import java.io.File;

class DisplayAll{
    public static void main(String[] args){
        File displayObjectOne = new File ("C:\\users\\arjun\\Desktop");
        File[] filesInDirectory = displayObjectOne.listFiles();
        try{
            System.out.println("Command Line Argument Provided : "+args[0]);
            if(args[0].equals("-f")){
                for(File filesInDir:filesInDirectory){
                    if(filesInDir.isFile()){
                        System.out.println(">> "+filesInDir.getName());
                    }
                }
            }else if(args[0].equals("-d")){
                for(File foldersInDir:filesInDirectory){
                    if(foldersInDir.isDirectory()){
                        System.out.println(">> "+foldersInDir.getName());
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException error){
            for(File filesInDir:filesInDirectory){
                if(filesInDir.isFile() || filesInDir.isDirectory()){
                    System.out.println(">> "+filesInDir.getName());
                }
            }
        }
    }
}
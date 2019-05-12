// Importing File class from Java io package.
// CLA in documentation refers to Command Line Argument.

import java.io.File;

// Creating a class named Display.
class Display{
    public static void main(String[] args){
        // To prevent any of the exception that may arise, I put the codes under try block.
        try{
            // File type object is created. This is used when no path is passed as Command Line Argument.
            File defaultPath = new File ("C:\\users\\arjun\\Desktop");
            // File type array is created for the every file present on default path.
            File[] filesInDefaultDirectory = defaultPath.listFiles();

            // If the Command Line Argument is provided.
            if(args.length != 0){
                //  If only one Command Line Argument is passed.
                if(args.length == 1){

                    // Creating a file type object from the Given Command Line Argument.
                    File fileFromPath = new File(args[0]);

                    // If CLA is either -f or -d.
                    if(args[0].equals("-f") || args[0].equals("-d")){
                        
                        // If CLA is -f.
                        if(args[0].equals("-f")){
                            // Assigns each file object of array to another file type object; for-each loop.
                            System.out.println("\nFiles listing on default path : ");
                            for(File filesInDefaultDir:filesInDefaultDirectory){

                                // Returns true if the file type object is file.
                                if(filesInDefaultDir.isFile()){
                                    System.out.println(">> "+filesInDefaultDir.getName());
                                }
                            }
                            System.out.println("Provided Command Line Argument : "+args[0]);

                        // If CLA is -d.
                        }else if(args[0].equals("-d")){
                            System.out.println("\nDirectory listing on default path : ");
                            // Assigns each file object of array to another file type object; for-each loop.
                            for(File foldersInDefaultDir:filesInDefaultDirectory){
                                // Returns true if the file type object is directory.
                                if(foldersInDefaultDir.isDirectory()){
                                    System.out.println(">> "+foldersInDefaultDir.getName());
                                }
                            }
                            System.out.println("Provided Command Line Argument : "+args[0]);
                        }

                    // If CLA is path of any directory.
                    }else if(fileFromPath.isDirectory()){

                        // Assigning CLA to string variable.
                        String path = args[0];                        

                        // Creating the file type object array of the files and directories present in the given path.
                        File[] thisDirectoryFromPath = fileFromPath.listFiles();
                        System.out.println("\nYou're in : "+fileFromPath.getAbsolutePath()+"\n"); 

                        // Assigns each file object of array to another file type object; for-each loop.
                        for(File thisDirFromPath : thisDirectoryFromPath){
                            // Prints if the file type object is either file or directory.
                            if(thisDirFromPath.isFile() || thisDirFromPath.isDirectory()){ 
                                System.out.println(">> "+thisDirFromPath.getName());
                            }
                        }
                        System.out.println("Provided Path : "+path);                        
                    }

                // Checks if CLA equals to two.
                }else if (args.length == 2){

                    // Creates file type object from the CLA number one.
                    File fileFromPath = new File(args[0]);

                    // File type array is created for the every file present on default path.
                    File[] thisDirectoryFromPath = fileFromPath.listFiles();
                    System.out.println("\nYou're in : "+fileFromPath.getAbsolutePath()+"\n"); 
                    for(File thisDirFromPath : thisDirectoryFromPath){

                        // Prints if the file type object is either file or directory.
                        if(thisDirFromPath.isFile() || thisDirFromPath.isDirectory()){ 
                            
                            // Checks if CLA number two is either -f or -d.
                            if(args[1].equals("-f")){
                                if(thisDirFromPath.isFile()){
                                    System.out.println(">> "+thisDirFromPath.getName());
                                }
                            }else if(args[1].equals("-d")){
                                if(thisDirFromPath.isDirectory()){
                                    System.out.println(">> "+thisDirFromPath.getName());
                                }
                            }
                        }
                    }
                }
            }else{
                // This runs if none of CLA is passed; it displays all files and directories from default path provided.
                File[] thisDirectoryDefault = defaultPath.listFiles();
                System.out.println("\nYou're in : "+defaultPath.getAbsolutePath()+"\n"); 
                for(File thisDirDefault : thisDirectoryDefault){
                    if(thisDirDefault.isFile() || thisDirDefault.isDirectory()){ 
                        System.out.println(">> "+thisDirDefault.getName());
                    }
                }
                System.out.println("Default Path : "+defaultPath);
            }            
        }catch(Exception error){
            // Prints the error if arised.
            error.printStackTrace();
        }   
    }
}
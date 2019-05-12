# File 

``` File f = new File ("myTextFile.txt")```  
- Won't create physical file but this is java ile object.  
### To check :  
```System.out.println(f.exists()); // It returns false. ```

### To create physical file : 

```f.createNewFile(); ```  
```f.exists(); // Now, it returns true.```

Java io is used on UNIX system. It can be used to represent directory also.

### To create directory :

``` File f = new File ("GCES") ;```  
```f.mkdir() ;```

## Constructors :

1. ```File f = new File(String name);```
 - To represent resources in current working directory.  

2. ```File f = new File("directory = name","file name");```  

3. ```File f = new File(File subdirectory, String name);```

> File subdirectory refers to another object of File type.

## Methods :

1. ```boolean exists();```
2. ```boolean createNewFile();```
3. ```boolean mkdir();```
4. ```boolean isFile();```
5. ```boolean isDirectory();```
6. ```String[] list();```
7. ```long length();```
8. ```boolean delete();```


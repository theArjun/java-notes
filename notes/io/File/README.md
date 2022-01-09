---
title: File
description: Brief info about File Class and examples.
---
``` File f = new File ("myTextFile.txt")```  
- Won't create physical file but this is java ile object.  
### Check Existence
```System.out.println(f.exists()); // It returns false. ```

### Create File

```f.createNewFile(); ```  
```f.exists(); // Now, it returns true.```

Java io is used on UNIX system. It can be used to represent directory also.

### Create Directory

``` File f = new File ("GCES") ;```  
```f.mkdir() ;```

## Constructors

1. ```File f = new File(String name);```
 - To represent resources in current working directory.  

2. ```File f = new File("directory = name","file name");```  

3. ```File f = new File(File subdirectory, String name);```

> File subdirectory refers to another object of File type.

## Methods 

1. ```boolean exists();```
2. ```boolean createNewFile();```
3. ```boolean mkdir();```
4. ```boolean isFile();```
5. ```boolean isDirectory();```
6. ```String[] list();```
7. ```long length();```
8. ```boolean delete();```



## Examples
#### Counts File inside Directory
- Counts file inside a directory path..
```java
{% include 'io/File/CountsFile.java' %}
```

#### Display File and Directories
- Display a list of files and directories inside a directory path.
```java
{% include 'io/File/DisplayFileAndDirectories.java' %}
```

# Packages
- They are containers for classes.
- Package allows you to create a class named ABC, which you can store in your own package without concern that it will collide with some other class named ABC stored elsewhere.
- Java provides a mechanism for partitioning the class name space more manageable chunks. This mechanism is referred as package.
- Package is both a naming and a visibility ⏩ "default" control mechanism.

## Defining a Package

> To create:
- include a package command as the first statement in a Java source file.
- Any classes declared within that file will belong to the specified package.
- If you omit the package statement, the class names are put into the default package, which has no name.

>In C and C++, header file  

Syntax :

        package package_name;

- Java uses file system directories to store packages.
- For example, the .class files for any classes you declare to be part of myPackage must be stored in directory called MyPackage.

> Directory name must match the package name exactly.

-  Can create a hierarchy of package

        package com.nepal.java
        com \ nepal \ java

## Finding Packages and CLASSPATH
> How does the Java runtime system know where to look for package that you create ?

- First, by default, the Java runtime system uses the current working directory as its starting point. Thus, if your package is in a sub directory of the current directory, it will be found.
- Second, you can specify a directory path or paths by setting CLASSPATH environment variable.
- Third, can use - CLASSPATH option with Java and javac to specify the path to your classes.

## Importing Packages
><b>Case I

        // We can only use Date class in program.

        import java.util.Date;
        class MyDate extends Date{

        }

>Case II

        // We can use every classes of util packages in program.

        import java.util.*;
        class MyDate extends Date{

        }

>Case III

        // We can use any class we want; FQPM = Fully Qualified Package Name

        class MyDate extends java.util.Date{

        }    
</b>

## Types of packages

1. User defined packages
- Defined by the developers as poer their applicaion requirements.

 <b>
        Package abc;
        Package bac;
        Package cba;
        class Test{

        }
</b>

2. Pre Defined Packages

- are defined by java programming language and provide along with java software.

i. exampleOne : ```java.lang```
- This is default packagem no need to import in JAVA. It is able to include all basic classes and interfaces which are required to prepare basic program system, object, String Buffer, String Builder Thread, Runnable, All Wrapper Classes (Byte, Short), Exception and its sub class come under ```java.lang```.

ii. exampleTwo : ```java.io```
- To perform input and output operation.
- InputStream, ByteArrayInputStream, FileInputStream, OutputStream, Reader, Writer etc.

iii. exampleThree : ```java.util```
- Representing all data structures.
- List, Array List, Vector, Stack, LinkedList, Set, HasSet, Queue, SortedSet, Map, HashMap etc.

iv. exampleFour : ```java.awt```
- To prepare GUI application
- Frame, Button, Label, List, TextField, TextArea etc.

v. exampleFive : ```javax.swing```
- To prepare GUI application
- To overcome drawbacks of ```awt```

vi. exampleSix : ```java.net```
- To prepare distributed application on the basis of Socket Programming
- Socket, URL, URLConnection

vii. exampleSeven : ```java.sql```
- To prepare JDBC applications
- Driver, Connection, Statement
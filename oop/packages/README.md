# Packages
- They are containers for classes.
- Package allows you to create a class named ABC, which you can store in your own package without concern that it will collide with some other class named ABC stored elsewhere.
- Java provides a mechanism for partitioning the class name space more manageable chunks. This mechanism is referred as paclkage.
- Package is both a naming and a visibility ⏩ "default" control mechanism.

## Defining a Package

> To create:
- include a package command as the first statement in a Java source file.
- Any classes declared within that file will belong to the specified package.
- If you omit the package statement, the class names are put into the default package, which has no name.

In C and C++, header file  
Syntax :

        package package_name;

- Java uses file system directories to store packages.
- For example, the .class files for any classes you declare to be part of myPackage must be stored in directory called MyPackage.

> Directory name must match the package name exactly.

-  Can create a hierarchy of package

        package com.nepal.java
        com \ nepal \ java


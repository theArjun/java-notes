---
title: PrintWriter
description: Brief info about PrintWriter Class and examples.
---
> Solves problems of FileWriter and BufferedWriter

## Constructors :

1. ```PrintWriter bw  = new PrintWriter(String fname);```  
2. ```PrintWriter bw  = new PrintWriter(File f);```  
3. ```PrintWriter bw  = new PrintWriter(Writer w);```  

## Methods

1. ```write (int ch)```  
2. ```write(char[] ch)```  
3. ```write(String s)```  
4. ```flush()```  
5. ```close()```  
6. ```print(char ch)...print(int i)...print(boolean b)...print(String s)```   
7. ```println(char ch)...println(int i)...println(boolean b)...println(String s)```   

## Examples
#### Write On File
- Write some text on file named "abc.txt".
```java
{% include 'io/PrintWriter/WriteIntoFile.java' %}
```

---
title: BufferedReader
description: Brief info about BufferedReader Class and examples.
---
> Read line by line or char by char

## Constructors

1. ```BufferedReader br = new BufferedReader("abc.txt");``` ❌ // cannot directly communicate with data. 
2. ```BufferedReader br  = new BufferedReader(Reader r);```    
3. ```BufferedReader br  = new BufferedReader(Reader r, int BufferSize);```    

## Methods

1. ```int read()```   
2. ```int read(char[] ch)```  
3. ```void close()```  // 1, 2 3 are same as FileReader
4. ```String readline()```  
    - To insert line separator.  


## Examples
#### Text File
- A sample text file named "gces.txt".
```
{% include 'io/BufferedReader/gces.txt' %}
```

#### Read File 
- Read from "gces.txt" with BufferedReader.
```java
{% include 'io/BufferedReader/ReadFromGCES.java' %}
```

#### Read File With ReadLine
- Read from "gces.txt" with BufferedReader using `readLine()` method..
```java
{% include 'io/BufferedReader/ReadFromGCES.java' %}
```

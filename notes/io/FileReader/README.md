---
title: FileReader
description: Brief info about FileReader Class and examples.
---

- to read characters data or text data.
- Here, we can read character by character by character; not line by line.

## Constructors

1. ```FileReader fr  = new FileReader(String fileName);```
2. ```FileReader fr  = new FileReader(File f);``` 

**If no file is available, this will throw exception.**

## Methods
1. ```int read ()```
- Unicode value of character.
2. ```int read (char[] ch)```
- no of characters copied from file into array.
3. ```void close()``` 

## Examples
#### Text File
```
{% include 'io/FileReader/myText.txt' %}
```

#### Read File By Looping
- Demo of a FileReader class.
```java
{% include 'io/FileReader/FileReaderDemo.java' %}
```

#### Read File With Character Array
- Demo of a FileReader class using a array.
```java
{% include 'io/FileReader/FileReaderIntoArray.java' %}
```

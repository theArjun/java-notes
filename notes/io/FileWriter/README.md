---
title: File Writer (Text data or character data)
description: Brief info about FileWriter Class and examples.
---
## Constructors

1. ```FileWriter fw  = new FileWriter(String name);```
2. ```FileWriter fw  = new FileWriter(File f);```
3. ```FileWriter fw  = new FileWriter(String name, boolean append);```
4. ```FileWriter fw  = new FileWriter(File f, boolean append);```  

> Constructors listed 1 and 2 overrides the existing data, but Constructors listed 3 and 4 appends to existing data.

**If no file is available, this will create that file.**

## Methods
1. ```write (int ch)```
- to write a single character to the file.

        fw.write(100); // Unicode value for d is 100
        fw.write('d'); // Both writes d.

2. ```write(char[] ch)```
3. ```write(String s)```
4. ```flush()```
- To guarantee our data including last char also on written property.
5. ```close()``` 


## Examples
#### FileWriter Demo
```java
{% include 'io/FileWriter/FileWriterDemo.java' %}
```

#### FileWriter Append Demo
```java
{% include 'io/FileWriter/FileWriterAppendDemo.java' %}
```

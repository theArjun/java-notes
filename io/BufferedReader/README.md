# BufferedReader
> Read line by line or char by char

## Constructors :

1. ```BufferedReader br  = new BufferedReader("file.txt");``` ❌ // cannot directly communicate with data.    
2. ```BufferedReader br  = new BufferedReader(Reader r);```  
3. ```BufferedReader br  = new BufferedReader(Reader r, int BufferSize);```   

## Methods

1. ```int read()```   
2. ```int read(char[] ch)```  
3. ```void close()```  // 1, 2 3 are same as FileReader
4. ```String readline()```  
    - To insert line separator.  

# BufferedWriter

## Constructors :

1. ```BufferedWriter bw  = new BufferedWriter("abc.txt");``` ❌ // cannot directly communicate with data.    
     ```BufferedWriter bw  = new BufferedWriter(Writer w);```  
2. ```BufferedWriter bw  = new BufferedWriter(Writer w, int buffer size);```  

### Which one of these are true ?  

1. ```BufferedWriter bw  = new BufferedWriter("abc.txt")``` ❌  
2. ```BufferedWriter bw  = new BufferedWriter(new File("abc.txt"))``` ❌    
3. ```BufferedWriter bw  = new BufferedWriter(new FileWriter("abc.txt"))``` ✅    
4. ```BufferedWriter bw  = new BufferedWriter(new FileWriter(new FileWriter("abc.txt")))``` ❌    

## Methods

1. ```write (int ch)```  
2. ```write(char[] ch)```  
3. ```write(String s)```  
4. ```flush()```  
5. ```close()```   
6. ```newLine()```  
    - To insert line separator.  

-  BufferedWriter is almost similar to FileWriter but it uses internal buffer to write data info file. So, if the number of write operation are more, the actual IO operations are less and performance is better.  
- You should use  BufferedWriter when no. of write operations are more.  

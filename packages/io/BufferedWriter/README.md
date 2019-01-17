# BufferedWriter

## Constructors :

1. ```BufferedWriter bw  = new BufferedWriter("abc.txt");``` ❌ // cannot directly communicate with data.    
     ```BufferedWriter bw  = new BufferedWriter(Writer w);```  
2. ```BufferedWriter bw  = new BufferedWriter(Writer w, int buffer size);```  

### Which one of these are true ?  

1. ```BufferedWriter bw  = new BufferedWriter("abc.txt")``` ❌  
2. ```BufferedWriter bw  = new BufferedWriter(new File("abc.txt"))``` ❌    
3. ```BufferedWriter bw  = new BufferedWriter(new FileWriter("abc.txt"))``` ✅    
4. ```BufferedWriter bw  = new BufferedWriter(new FileWriter(new FileWriter("abc.txt")))``` ✅    


-  BufferedWriter is almost similar to BufferedWriter but it uses internal buffer to write data info file. So, if the number of write operation are more, the actual IO operations are less and performance is better.  
- You should use  BufferedWriter when no. of write operations are more.  
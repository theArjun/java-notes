# Array 

Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

**Array is indexed collection of fixed number of homogeneous data element.**

## Advantages 
- We can represent huge number of value using single variable. So, that readability of code will be improved.
- Multiple data items of same data type can be accessed using single name.
- Arrays can be used to implement matrices.
- Data structure like queue , linked list can be accessed using arrays.

## Downpoints
- Fixed in size
- Since array is of fixed size, if we allocate more memory than requirement then the memory space will be wasted. And if we allocate       less memory than requirement, then it will create problem.
- The elements of array are stored in consecutive memory locations. So insertions and deletions are very difficult and time consuming.
- Can only hold similar type of data. To overcome this, we use collection framework.

## Declaration
```java
int[] x;
int []x;
int x[];
```

## One Dimensional Array
```java
int[6] x; ❌ //  We cannot define size in declaration. So, we must specify in creation.

String[] args; ✅ Best way
String []args;
String args[];
```

## Two Dimensional Array
```java
int[][]   x;
int   [][]x;
int[]   []x;
int[]   x[];
int   []x[];
```

## Instantiation 
```java
int[] x = new int[1000]; // fixed in size.
```
        
## Initilization
```java
int a[] = new int[5];//declaration and instantiation  
a[0] = 10; 
a[1] = 20;  
a[2] = 70;  
a[3] = 40;  
a[4] = 50; 
```

## Note

- Every Object in Java is object only.
- For every array type, corresponding class are available but not available in programming level.

```java
System.out.println(a.getClass().getName());
```

| Array Type | Corresponding Class Name |
| ---------- | ------------------------ |
| int[ ]     | [ I                      |
| int[ ][ ]  | [ [ I                    |
| double[ ]  | [ D                      |
| short[ ]   | [ S                      |
| byte[ ]    | [ B                      |
| boolean[ ] | [ Z                      |
| char[ ]    | [ C                      |
| long[ ]    | [ J                      |

## Examples
```java
int[] a,b; -> 1D Array
int[] a[],b[]; -> 2D Array
int[] []a,b[]; -> 2D,3D Array
int[] a[]b; -> 2D Array
int[] []a,b; -> 2D Array
int[][]a, []b; ❌ // [ ] can be shared with all, if it comes before variable.

int[]x = new int[]; // ❌ Size should be mentioned.
int[]x = new int[0]; ✅
int[]x = new int[-2]; // ✅ Runtime error; though compiled.

byte b = 20;
int[] x = new int[b];
int[] x = new int['b']; // Character ASCII gets inputed.
```
## Internal Representation
Follwing way, we can know more about the internal representation of Arrays.

```java
{% include 'general/internalRepresentation.java' %}
```

# Array 

Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

**Array is indexed collection of fixed number of homogeneous data element.**

## Advantages 
- We can represent huge number of value using single variable. So, that readability of code will be improved.

## Downpoints
- Fixed in size
- Can only hold similar tyhpe data. To overcome this, we use collecetion.

## Declaration
        int[] x;
        int []x;
        int x[];

## One Dimensional Array
        int[6] x; ❌ //  We cannot define size in declaration. So, we must specify in creation.

        String[] args; ✅ Best way
        String []args;
        String args[];

## Two Dimensional Array
        int[][]   x;
        int   [][]x;
        int[]   []x;
        int[]   x[];
        int   [][]x;
        int   []x[];

## Initialization
        int[] x = new int[1000]; // fixed in size.

## Examples
    int[] a,b; -> 1D Array
    int[] a[],b[]; -> 2D Array
    int[] []a,b[]; -> 2D,3D Array
    int[] a[]b; -> 2D Array
    int[] []a,b; -> 2D Array
    int[][]a, []b; ❌ // [ ] can be shared with all, if it comes before variable.

### Note

- Every Object in Java is object only.
- For every array type, corresponding class are available but not available in programming level.

        System.out.println(a.getClass().getName());

| Array Type | Corresponding Class Name |
|------------|--------------------------|
| int[ ]     | [ I                      |
| int[ ][ ]  | [ [ I                    |
| double[ ]  | [ D                      |
| short[ ]   | [ S                      |
| byte[ ]    | [ B                      |
| boolean[ ] | [ Z                      |
| char[ ]    | [ C                      |
| long[ ]    | [ J                      |

int[]x = new int[]; // ❌ Size should be mentioned.
int[]x = new int[0]; ✅
int[]x = new int[-2]; // ✅ Runtime error; though compiled.

    byte b = 20;
    int[] x = new int[b];
    int[] x = new int['b']; // Character ASCII gets inputed.
   



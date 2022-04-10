// Let's Experience 5D Array 
// www.github.com/thearjun/Java

class ArrayRepresentation{
    public static void main(String[] args){

        // First Level
        int[][][][][] array = new int [4][][][][];

        // Second Level
        array[0] = new int [1][][][];
        array[1] = new int [1][][][];
        array[2] = new int [1][][][];
        array[3] = new int [3][][][];

        // Third Level
        array[0][0] = new int [2][][];
        array[2][0] = new int [2][][];
        array[3][0] = new int [1][][];

        // Fourth Level
        array[0][0][0] = new int [2][];
        array[0][0][1] = new int [1][];

        // Fifth Level
        array[0][0][1][0] = new int [2];

        // Value Assign for first level
        array[0][0][0][0][0] = 1;
        array[1][0][0][0][0] = 2;
        array[2][0][0][0][0] = 3;
        array[3][0][0][0][0] = 4;

        // Value assign for second level
        array[0][0][0][0][0] = 5;
        array[1][0][0][0][0] = 13;
        array[2][0][0][0][0] = 14;
        array[3][0][0][0][0] = 18;
        array[3][1][0][0][0] = 19;
        array[3][2][0][0][0] = 20;

        // Value assign for third level
        array[0][0][0][0][0] = 6;
        array[0][0][0][0][0] = 6;
        array[2][0][0][0][0] = 15;
        array[2][0][1][0][0] = 16;
        array[3][0][0][0][0] = 17;

        // Value assign for fourth level
        array[0][0][0][0][0] = 8;
        array[0][0][0][1][0] = 9;
        array[0][0][1][0][0] = 10;
        
        // Value assign for fifth level
        array[0][0][1][0][0] = 11;
        array[0][0][1][0][1] = 12;
    
        // // Now we are printing the elements of array. We know that we haven't assigned 0 to any of those memory blocks, so we print the elements which are not zero.

        // System.out.println("First Level Elements  : [ ");
        // for(int i = 0; i < 4; i++){
        //     System.out.println(array[i]+" ");

        //     // if(array[i]!=0){
        //     //     System.out.println(array[i]+" ");
        //     // }
        // }
        // System.out.print("]");
    }
}
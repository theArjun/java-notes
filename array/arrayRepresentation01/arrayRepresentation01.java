class ArrayRepresentation{
    public static void main(String[] args){
        // First the level of the array is pre-defined, and initial indearray of the array is mentioned in assignation.
        int[][][] array = new int [2][][]; 

        // First Level
        array[0] = new int [3][];
        array[1] = new int [2][];

        // Second Level
        array[0][0] = new int [1];
        array[0][1] = new int [2];
        array[0][2] = new int [3];

        array[1][0] = new int [2];
        array[1][1] = new int [2];

        // In this way, the memory blocks are allocated and no memory leakage happens here.
    }
}
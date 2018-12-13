class ArrayRepresentation{
    public static void main(String[] args){
        // First the level of the array is pre-defined, and initial index of the array is mentioned in assignation.
        int[][][] x = new int [2][][]; 

        // First Level
        x[0] = new int [3][];
        x[1] = new int [2][];

        // Second Level
        x[0][0] = new int [1];
        x[0][1] = new int [2];
        x[0][2] = new int [3];

        x[1][0] = new int [2];
        x[1][1] = new int [2];

        // In this way, the memory blocks are allocated and no memory leakage happens here.
    }
}
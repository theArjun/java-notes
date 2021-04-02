class Fibonacci{
    // Declaring variables for array and index used for storing the elements of fibonacci series.
    private int index;
    private final int[] list;

    // Parameterized constructor that stores index and initializes array of particular index.
    Fibonacci(int index){
        this.index = index;
        list = new int[index];
    }

    // Fibonacci Series that implements by recursion
    public int fibonacci(int number){
        if(number <= 1){
            // If provided input is 1 or less than 1, 1 is returned.
            return 1;
        }else{
            // Key algorithm
            return fibonacci(number - 1) + fibonacci(number -2);
        }
    }

    public void display(){
        // Loop runs from 0 to index-1 or before index.
        for(int i = 0; i < this.index ; i++){
            // Stores each fibonacci element to array.
            list[i] = fibonacci(i);
            // Prints the array.
            System.out.print(" "+list[i]);
        }
    }
}
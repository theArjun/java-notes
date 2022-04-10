public class Fibonacci{
    private int numberOne;
    private int numberTwo;
    private int numberThree;
    private int list;
      
    // If parameter is passed.
    Fibonacci(int numberOne, int numberTwo, int list){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.list = list;
    }

    // Setter for Number One
    public void setNumberOne(int numberOne){
        this.numberOne = numberOne;
    }

    // Setter for Number Two
    public void setNumberTwo(int numberTwo){
        this.numberTwo = numberTwo;
    }

    // Setter for List of Numbers
    public void setList(int list){
        this.list = list;
    }

    // Non - Recursive Algorithm:
    public void nonRecursive(){
        System.out.println("Fibonacci Series : ");
        for(int i = 0; i < this.list; i++){
            // Print the first number
            System.out.print(this.numberOne+" ");
            // Assign third number to the sum of first and second number.
            numberThree = numberOne + numberTwo;
            // Assign first number to second number.
            numberOne = numberTwo;
            // Assign second number to third number.
            numberTwo = numberThree;
        }
    }
}
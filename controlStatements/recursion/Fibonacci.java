public class Fibonacci{

    private int number;

    // Setter for number.
    public void setNumber(int number){
        this.number = number;
    }

    // Getter for number.
    public int getNumber(){
        return this.number;
    }

    // Getter for factorial number.
    public int getFactNumber(){
        return this.factorial(this.number);
    }

    // Function that calculates factorial of a number by recursion.
    public int factorial (int number){
        // Factorial of 0 is suppossed to be 1.
        if(number == 0){
            return 1;
        }else{
            // This code implements recursion.
            return number * factorial(number - 1);
        }
    }
}
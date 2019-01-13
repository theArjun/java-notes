class FibonacciDemo{
    public static void main(String[] args ){
        // In parameterized constructor, first number & second numbers are the parameters used for calculation used in fibonacci series, whereas third number is used for the iteration.
        Fibonacci fibonacciObjectOne = new Fibonacci(1,2,8);
        fibonacciObjectOne.nonRecursive();
    }
}
class FactorialDemo{
    public static void main(String[] args){
        Fibonacci numberOne = new Fibonacci();
        numberOne.setNumber(5);
        
        System.out.println("Factorial of "+numberOne.getNumber()+" is "+numberOne.getFactNumber());
    }
}
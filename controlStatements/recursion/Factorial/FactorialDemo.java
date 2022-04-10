class FactorialDemo{
    public static void main(String[] args){
        Factorial numberOne = new Factorial();
        numberOne.setNumber(5);
        
        System.out.println("Factorial of "+numberOne.getNumber()+" is "+numberOne.getFactNumber());
    }
}
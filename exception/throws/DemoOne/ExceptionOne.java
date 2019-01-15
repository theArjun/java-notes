class ExceptionOne{
    static void validAge(int age) throws MyException{ // We need to declare the exception; that the method may throw.
        if(age < 18){
            throw new MyException("You should be 18+ to cast vote.");
        }else{
            System.out.println("You can vote.");
        }
    }

    public static void main(String[] args){
        // If we don't catch the exception : error: unreported exception MyException; must be caught or declared to be thrown.
        // So we are calling the function under try catch block.

        try{
            validAge(19); // During call of the method, programmer must use try catch mechanism. 
        }catch(MyException error){
            error.printStackTrace();
        }
    }
}
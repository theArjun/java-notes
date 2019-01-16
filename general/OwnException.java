// Create your own Exception.

class MyException extends Exception { // Inherits the partially unchecked exception class Exception.
    MyException(String msg) { // Parameterized constructor for MyException.
        super(msg); // Calls the constructor of Exception class; super class.
    }
}

class ExceptionDemo {
    static void isValid(int age) throws MyException { // Denotes this code may contain Exception; declaring exception here.
        if(age < 18){
            throw new MyException("Age is less than 18.");
        }else{
            System.out.println("Cool, age is greater than 18.");
        }
    }

    public static void main(String[] args){
        try{
            isValid(17); // Age is 17; which is less than 18 and should exception.
        }catch(MyException error){
            error.printStackTrace();
        }
    }
}
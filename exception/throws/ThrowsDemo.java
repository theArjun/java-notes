class ThrowsDemo{
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throw : ");
        // throw new ArithmeticException();
        // try{
            throw new IllegalAccessException();
        // }catch(IllegalAccessException errorMessage){
        //     System.out.println("Error : "+errorMessage.getMessage());
        // }
    }
    public static void main(String[] args){
        try{
            throwOne();
        }catch(IllegalAccessException errorMessage){
            System.out.println("Error : "+errorMessage.getMessage());
        }
    }
}
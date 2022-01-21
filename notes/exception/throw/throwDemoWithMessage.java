class ThrowDemo{
    public static void main(String[] args){
        try{
            throw new ArithmeticException("bhag gareko sunya le");
        }
        catch(ArithmeticException errorMessage){
            System.out.println("Error : "+errorMessage);
            System.out.println("Message : "+errorMessage.getMessage());
        }
        System.out.println("Happy Ending");
    }
}
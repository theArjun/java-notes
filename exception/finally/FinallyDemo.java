class FinallyDemo{
    static void methodOne(){
        try{
            System.out.println("This is inside method one.");
            throw new ArithmeticException();
        }finally{
            System.out.println("This gets printed everytime.");
        }
    }
    static void methodTwo(){
        try{
            System.out.println("This is inside method two.");
        }finally{
            try{
                System.out.println("This is inside nested try statement.");
                throw new RuntimeException();
            }catch(RuntimeException errorMessage){
                System.out.println("Error : "+errorMessage.getMessage());
            }finally{
                System.out.println("Inside Finally block of Nested Try");
            }
        }
    }
    public static void main(String[] args){
        // methodOne();
        methodTwo();
    }
}
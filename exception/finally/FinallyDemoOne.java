class FinallyDemo{
    static void finallyOne(){
        int b = 0;
        int a;
        try{
            System.out.println("Inside try.");
            a = 2 / b;
            return;
        }catch(ArithmeticException errorMessage){
            System.out.println("Inside catch.");
        }finally{
            System.out.println("Good Bye");
        }
    }
    public static void main(String[] args){
        finallyOne();
    }
}
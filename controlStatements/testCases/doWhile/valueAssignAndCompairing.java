class DoWhile{
    public static void main(String[] args){
        int a = 10, b = 20;
        do{
            System.out.println("Hello World"); // This prints infinitely.
        }while(a<b); // Java assigns value at run time.
        System.out.println("Hello Venus"); // This is unreachable statement here.
    }
}
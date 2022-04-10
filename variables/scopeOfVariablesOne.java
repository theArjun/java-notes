class Scope{
    public static void main(String[] args){
        if(true){
            int i ; // For local variable, JVM won't provide default value sp we must provide value explicitly before using it.
            System.out.println(i); // error: variable i might not have been initialized
        }else{
            // System.out.println(i); //error: cannot find symbol
            System.out.println("Hello Eveyone");
        }
    }
}
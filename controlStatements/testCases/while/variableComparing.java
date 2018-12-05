class WhileTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        while(a>b){
            System.out.println("Hello World"); // This statement won't run as compiler assigns the boolean value of a and b in run time (not in compile-time) & found it to be false.
        }
        System.out.println("Hello Venus"); // 
    }
}
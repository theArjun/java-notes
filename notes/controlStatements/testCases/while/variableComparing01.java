class WhileTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        while(a<b){
            System.out.println("Hello World"); // This statement runs infinitely.
        }
        System.out.println("Hello Venus"); // This is not printed and it is not an unreachable statement as it is the process to be checked on compile time.
    }
}
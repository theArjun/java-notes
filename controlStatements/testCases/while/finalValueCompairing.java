class WhileTest {
    public static void main(String[] args) {
        final int a = 10, b = 20;
        while(a<b){
            System.out.println("Hello World"); // This statement is expected to run BUT...
        }
        System.out.println("Hello Venus"); // This is an unreachable statement.
    }
}
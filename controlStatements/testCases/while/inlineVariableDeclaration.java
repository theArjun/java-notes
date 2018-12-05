class WhileTest {
    public static void main(String[] args) {
        while(true)
            int x = 10; // This statement doesn't gets compiled; variable declaration in inline statement is prohibited.
    }
}
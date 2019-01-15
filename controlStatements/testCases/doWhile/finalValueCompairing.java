class DoWhile {
    public static void main(String[] args) {
        final int a = 10, b = 20;
        do {
            System.out.println("Hello World"); // This gets printed once because of exit-controlled mechanism.
        } while (a > b);
        System.out.println("Hello Venus"); // This also gets printed once.
    }
}
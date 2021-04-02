class Exception {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d; // This generates run-time error.
            System.out.println("This will not be printed.");
        } catch (Exception e) { // e is error; also a parameter type of Arithmetic Exception.
            System.out.println("Divide by zero."); // This will get executed.
        }
        System.out.println("After catch.");
    }
}
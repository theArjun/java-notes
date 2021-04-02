class IfTest {
    public static void main(String[] args) {
        int x = 10;
        if (x == 20) { // This compile as if statement expects boolean value as parameter.
            System.out.println("Hello Mercury");
        } else {
            System.out.println("Hello Venus");
        }
    }
}
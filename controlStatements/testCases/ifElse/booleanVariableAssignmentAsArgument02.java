class IfTest {
    public static void main(String[] args) {
        boolean x = true;
        if (x = true) { // This compile as if statement expects boolean value as parameter. This throws true.
            System.out.println("Hello Mercury");
        } else {
            System.out.println("Hello Venus");
        }
    }
}
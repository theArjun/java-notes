class IfTest {
    public static void main(String[] args) {
        boolean x = false;
        if (x == false) { // This compile as if statement expects boolean value as parameter. This throws true.
            System.out.println("Hello Mercury");
        } else {
            System.out.println("Hello Venus");
        }
    }
}
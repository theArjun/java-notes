class IfTest {
    public static void main(String[] args) {
        boolean x = true;
        if (x = false) { // This compile as if statement expects boolean value as parameter, parameter is false here.
            System.out.println("Hello Mercury");
        } else {
            System.out.println("Hello Venus");
        }
    }
}
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throw : ");
        // throw new ArithmeticException();
        // try{
        throw new IllegalAccessException();
        // }catch(IllegalAccessException errorMessage){
        // System.out.println("Error : "+errorMessage.getMessage());
        // }
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException errorMessage) {
            System.out.println("Error : " + errorMessage.getMessage());
        }
    }
}

// Step 1: Throw new ArithmeticException without handler
// Step 2: Throw new IllegalAccessException; needs handler
// Step 3: Throw new IllegalAccessException with try catch
// Step 4: IllegalAccessException with throws; with handler on main() method
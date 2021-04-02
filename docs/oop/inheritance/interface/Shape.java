// First we are creating a interface named Shape.
interface Shape{
    void draw();
    // Now we are implementing the default keyword for methods.
    // Using the default keyword, we can have body inside the method in abstract classes.
    default void area(){
        System.out.println("Area from Shape");
    }
    // Now we are implementing the final/static keyword in order to declare the variable.
    final int perimeter = 1;
}
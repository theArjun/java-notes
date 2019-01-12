abstract class Shape{ // To make abstract method, we must make abstract class too.
    double radius, length, height, breadth;
    void paint(){
        System.out.println("I am painting.");
    }
    abstract void draw(); // This must be overridden.
}


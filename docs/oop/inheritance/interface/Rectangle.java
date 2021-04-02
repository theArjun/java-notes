class Rectangle implements Shape{
    // Implementing the draw method from Shape
    public void draw(){
        System.out.println("Inside Draw of Rectangle");
    }
    // Implementing the default area method from Shape; not mandatory
    public void area(){
        System.out.println("Inside area of Rectangle");
    }
    // Now we are creating the method that prints the perimeter inherited from the Shape Class.
    public void printPerimeter(){
        System.out.println("Perimeter of Rectangle: "+perimeter);
    }
}
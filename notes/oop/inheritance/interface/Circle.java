class Circle implements Shape{
    // Implementing the draw method from Shape
    public void draw(){
        System.out.println("Inside draw of Circle");
    }
    // Implementing the default area method from Shape; not mandatory
    public void area(){
        System.out.println("Inside area of Circle.");
    }

    // Now we are creating the method that prints the perimeter inherited from the abstract method.
    public void printPerimeter(){
        System.out.println("Perimeter of Circle : "+perimeter*5);
    }
}
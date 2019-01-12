class InterfaceDemo{
    public static void main(String[] args){
        // First we are creating the referrer variable of Abstract class and assigning it to the object of Circle Class.
        Shape shapeReferrer = new Circle();
        // Then, we are envoking the draw method from the Circle.
        shapeReferrer.draw();
        shapeReferrer.area();

        // Abstract class can only call the method defined in it.
        // shapeReferrer.printPerimeter(); // Illegal

        // This will envoke the printPerimeter() function and hence prints the perimeter.
        Circle circleObjectOne = new Circle();
        circleObjectOne.printPerimeter();
        
        // Same applies for new object of Rectangle.
        shapeReferrer = new Rectangle();
        shapeReferrer.draw();
        shapeReferrer.area();

        Rectangle rectangleObjectOne = new Rectangle();
        rectangleObjectOne.printPerimeter();
        
    }
}
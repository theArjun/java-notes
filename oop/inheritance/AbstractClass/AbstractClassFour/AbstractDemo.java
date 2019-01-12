class AbstractDemo{
    public static void main(String[] args){
        Shape shapeObjectOne; // =  new Shape(); // Abstract class cannot instantiate any object. This is just a variable, not an object.
        // shapeObjectOne.paint(); // Yo garna paidaina

        Circle circleObjectOne = new Circle(); // Circle is not abstract and does not override abstract method draw() in Shape.
        circleObjectOne.draw();

    }    
}


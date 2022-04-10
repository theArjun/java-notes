class AbstractAreas{
    public static void main(String[] args){
        Figure figureObjectOne = new Rectangle(10,10); // Illegal now
        Rectangle rectangleObjectOne = new Rectangle(5,9);

        Figure figureReference; // This is OK; no object is created.
        figureReference = rectangleObjectOne;
        System.out.println("Area is : "+figureReference.area());

        Triangle triangleObjectOne = new Triangle(5,4);
        figureReference = triangleObjectOne;
        System.out.println("Area is : "+figureReference.area());
    }
}
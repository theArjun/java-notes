class AbstractAreas{
    public static void main(String[] args){
        Figure figureObjectOne = new Rectangle(10,10); // Illegal now
        Rectangle rectangleObjectOne = new Rectangle(5,9);

        Figure figureObjectReference; // This is OK; no object is created.
        figureObjectReference = rectangleObjectOne;
        System.out.println("Area is : "+figureObjectReference.area());

        Triangle triangleObjectOne = new Triangle(5,4);
        figureObjectReference = triangleObjectOne;
        System.out.println("Area is : "+figureObjectReference.area());
    }
}
class Rectangle extends Figure{
    Rectangle(double dimensionOne, double dimensionTwo){
        super(dimensionOne, dimensionTwo); // This calls the constructor of super class.
    }
    // override area for rectangle
    double area(){
        System.out.println("Inside Area for Rectangle : ");
        return dimensionOne*dimensionTwo;
    }
}
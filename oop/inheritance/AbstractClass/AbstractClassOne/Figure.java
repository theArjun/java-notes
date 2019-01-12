abstract class Figure{ // This is abstract class.
    double dimensionOne;
    double dimensionTwo;

    Figure(double dimensionOne, double dimensionTwo){
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;
    }
    abstract double area(); // This is abstract method.
}
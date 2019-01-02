abstract class Figure{
    double dimOne, dimTwo;
    Figure(double a, double b){
        dimOne = a;
        dimTwo = b;
    }
    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Rectangle");
        return dimOne*dimTwo;
    }
}
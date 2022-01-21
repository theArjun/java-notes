class Triangle extends Figure{
    Triangle(double dimensionOne, double dimensionTwo){
        super(dimensionOne,dimensionTwo);
    }
    // Override area for Right Triangle
    double area(){
        System.out.println("Inside area for Triangle : ");
        return dimensionOne * dimensionTwo/2;
    }
}
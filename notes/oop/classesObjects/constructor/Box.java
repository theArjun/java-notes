class Box
{
    double height, width, length;
    //default constructor
    Box()
    {
        height = 1.0;
        width = 2.0;
        length = 3.0;
    }
    //parameterized constructor
    Box(double height, double width, double length)
    {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    Box(double height)
    {

    }
    // void initiateVariable()
    // {
    //     height = 1.0;
    //     width = 2.0;
    //     length = 3.0;
    // }

    void volume()
    {
        System.out.println(height*width*length);
    }
}
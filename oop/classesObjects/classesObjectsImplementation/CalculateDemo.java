class CalculateDemo
{
    public static void main(String[] args)
    {
        //object as parameter
        Calculate obj1 = new Calculate(100,22);
        Calculate obj2 = new Calculate(100,22);
        Calculate obj3 = new Calculate(22,100);
        System.out.println("obj1 == obj2 :"+obj1.equalTo(obj2));
        System.out.println("obj1 == obj3 :"+obj1.equalTo(obj3));

    }
}
class Calculate
{
    int num1, num2;

    Calculate(int number1, int number2)
    {
        num1 = number1;
        num2 = number2;
    }

    boolean equalTo(Calculate obj)
    {
        if (obj.num1 == num1 && obj.num2 == num2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
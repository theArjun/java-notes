class Addition{
    int numOne, numTwo;

    Addition(int num1, int num2){
        numOne=num1;
        numTwo=num2;
    }
    int add(){
        // Till number two is equal to zero, the loop runs, else number one is sum itself.
        while (numTwo>0){
            // Carryover is the logical AND operation.
            int carry = numOne&numTwo;
            // Adding without carryover is simply the logical XOR operation.
            numOne = numOne^numTwo;
            // The carry is shifted to left, so that it can be added to the number ahead of it.
            numTwo = carry<<1;
        }
        // As we are assigning, sum to number one, it is returned from the function.
        return numOne;
    }
}
class NoArithmeticOperators{
    public static void main(String[] args){
        // 2 and 3 are passed for example.
        Addition exampleOne = new Addition(2,3);
        int sum = exampleOne.add();
        System.out.println("Sum : "+sum);
    }
}

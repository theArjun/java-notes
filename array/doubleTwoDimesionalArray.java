class DoubleTwoDArray{
    public static void main(String args[]){
        double nums[][]= {
                            {0.0,1.0,2.0},
                            {3.0,4.0,5.0},
                            {6.0,7.0,8,0}
                        }; /* Two declare a two dimensional array, the last braces should be ended with braces as like Class in C++ . */
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
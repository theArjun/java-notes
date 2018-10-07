class TwoDimensionalArray{
    public static void main(String args[]){
        int nums[][] = new int[4][5];

        int i,j,k=0;
        for (i=0;i<4;i++){
            for(j=0;j<5;j++){
                nums[i][j] = k;
                k++;
            }
        }

        for (i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(nums[i][j]+" "); /* Print doesn't gets printed in new line , but println does. Know the difference. */
            }
            System.out.println();
        }
    }
}
class TwoDArray{
    public static void main(String args[]){
        int nums[][] = new int[4][];
        nums[0] = new int[1];
        nums[1] = new int[2];
        nums[2] = new int[3];
        nums[3] = new int[4];
        int k = 0;

        for(int i=0;i<4;i++){
            for(int j=0;i<i+1;j++){                
                nums[i][j]=k;
                k++;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;i<i+1;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
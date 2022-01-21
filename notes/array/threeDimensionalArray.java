class ThreeDimensionalArray{
    public static void main(String args[]){
        int nums[][][] = new int [3][3][3];
        int l = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    nums[i][j][k] = l;
                    l++;                    
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.print(nums[i][j][k]+" ");            
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }
}
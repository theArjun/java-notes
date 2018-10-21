class ForEach{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        // Now we are using the for-each statements to display the elements of array.
        for(int x:nums){
            System.out.println("Value is : "+x);
        }
    }
}
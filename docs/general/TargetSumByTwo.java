
class TargetSumByTwo {
    public static void main(String[] args) {
        int[] array = { 5, 6, 7, 8, 9, -1 };  // Initializing array with random numbers.
        double num = 7.0; // Defining a number to be checked with double so that arithmetic processing becomes smooth. 
        boolean bool = false; // Defining a boolean value which denotes the existence of such number occurs or not.

        for (int i = 0; i < array.length; i++) { // Starting from beginning of array.
            for (int j = i + 1; j < array.length; j++) { // Starting from one index ahead of i.
                if (((array[i] + array[j]) / 2.0d) == num) { // Checks if num is equal to sum of numbers divided by two. Diving by double numbers helps to get precise answer.
                    bool = true; // bool stores true if such numbers occurs.
                    System.out.println("Sum of " + array[i] + " and " + array[j] + " = " + (int)num); // Type hinting is done to print the integer result.
                }
            }
        }

        if(bool == false){
            System.out.println("No such numbers found in array.");
        }
    }
}
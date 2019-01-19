class Five{
	public static void main(String[] args){
		for(int i = 1; i <= 4; i++){ // First we are running loop from 1 to 4.
			for(int j = 0; j < i; j++){ // Then we are running loop from 0 until i.
				System.out.print((j+i)%2+" "); // Sum of i and j modulus of 2 equals the alternate of 1 and 0. 
			}
			System.out.println();
		}
	}
}

// Practiced Algorithms

// System.out.print((int)(temp+Math.pow(-1,j))+" ");
// (int)(+Math.pow(-1,))
// System.out.print((j+1)%2+" ");
class InternalRepresentation {
    public static void main(String[] args) {
        // Integer[] array = new Integer[2];
        int[] array = new int[2];
        int[][] twoDArray = new int[2][2];
        double itsDouble[] = new double[2];
        short itsShort[] = new short[2];
        byte itsByte[] = new byte[2];
        boolean itsBoolean[] = new boolean[2];
        char itsChar[] = new char[2];
        long itsLong[] = new long[2];
        System.out.println("Array : " + array.getClass().getName());
        System.out.println("2D Array : " + twoDArray.getClass().getName());
        System.out.println("Double : " + itsDouble.getClass().getName());
        System.out.println("Short : " + itsShort.getClass().getName());
        System.out.println("Byte : " + itsByte.getClass().getName());
        System.out.println("Boolean : " + itsBoolean.getClass().getName());
        System.out.println("Char : " + itsChar.getClass().getName());
        System.out.println("Long : " + itsLong.getClass().getName());
        // For every array type, corresponding class are available but not available in
        // programming level.
    }
}
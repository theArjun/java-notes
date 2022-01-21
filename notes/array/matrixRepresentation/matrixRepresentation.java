class MatrixRepresentation {

    public static void main(String[] args) {
        int[][] x = new int[4][4];
        x[0][0] = 10;
        x[0][1] = 12;
        x[0][2] = 99;
        x[0][3] = 89;
        x[1][0] = 28;
        x[1][1] = 67;
        x[1][2] = 56;
        x[2][0] = 80;
        x[2][1] = 90;
        x[3][0] = 90;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
            }
            System.out.println();
        }
        System.out.println("The unassigned block of memory are assigned to zero.");
    }
}

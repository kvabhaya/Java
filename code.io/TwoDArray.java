public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
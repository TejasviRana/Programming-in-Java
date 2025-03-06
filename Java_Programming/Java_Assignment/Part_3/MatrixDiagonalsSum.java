public class MatrixDiagonalsSum {
/**
 * Calculates and prints the sums of the primary and secondary diagonals
 * of a given 3x3 matrix.
 * 
 * @param args command line arguments, not used
 */

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, -3}, {4, 5, 6}, {7, 8, -9} };
        int primary = 0, secondary = 0, n = matrix.length;
        for (int i = 0; i < n; i++) {
            primary += matrix[i][n - i - 1];
            secondary  += matrix[i][i];
        }
        System.out.println("Primary Diagonal: " + primary);
        System.out.println("Secondary Diagonal: " + secondary);
    }
}

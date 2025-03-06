package Part_2;

public class TransposeMatrix {
        /**
         * Transposes a square matrix in-place and prints the result.
         * For example, if the input matrix is
         * [
         *   [1, 2, 3],
         *   [4, 5, 6],
         *   [7, 8, 9]
         * ]
         * the output matrix is
         * [
         *   [1, 4, 7],
         *   [2, 5, 8],
         *   [3, 6, 9]
         * ]
         */
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int n = matrix.length;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        for (int[] row : matrix) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}


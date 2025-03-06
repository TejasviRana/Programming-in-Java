import java.util.Arrays;
public class Sort2DColumns {
        /**
         * Sorts a given 2D array by a column index (0-based) and prints the sorted result.
         * @param args command line arguments, not used
         */
    public static void main(String[] args) {
        int[][] arr = { 
            {39, 27, 11, 42},
            {10, 93, 91, 90},
            {54, 78, 56, 89},
            {24, 64, 20, 65}
        };
        int col = 3; // 3rd column = index 2
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
        for (int[] row : arr) System.out.println(Arrays.toString(row));
    }
}


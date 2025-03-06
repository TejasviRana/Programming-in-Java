import java.util.*;
public class RotateArray {
    /**
     * Rotate an array by d positions to the right. The array is 0-indexed.
     * For example, if the array is [1, 2, 3, 4, 5, 6, 7] and d = 2, the
     * rotated array is [3, 4, 5, 6, 7, 1, 2].
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++)
            rotated[i] = arr[(i + d) % n];
        System.out.println(Arrays.toString(rotated));
    }
}

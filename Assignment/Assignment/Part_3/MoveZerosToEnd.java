import java.util.Arrays;
public class MoveZerosToEnd {
    /**
     * Move all zeros to the end of the array, maintaining the order of non-zero elements.
     * Example: [1, 2, 0, 0, 0, 3, 6] -> [1, 2, 3, 6, 0, 0, 0]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        int index = 0;
        for (int num : arr)
            if (num != 0) arr[index++] = num;
        while (index < arr.length) arr[index++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}


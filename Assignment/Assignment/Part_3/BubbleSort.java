import java.util.Arrays;
public class BubbleSort {
    /**
     * Sorts an array of integers in ascending order using the bubble sort algorithm and prints the sorted array.
     * The bubble sort algorithm works by repeatedly swapping adjacent elements if they are in the wrong order.
     */
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println(Arrays.toString(arr));
    }
}

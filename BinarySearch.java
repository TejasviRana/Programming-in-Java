package Part_3;

import java.util.Arrays;
public class BinarySearch {
    /**
     * Tests the Arrays.binarySearch() method
     * @param args ignored
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 5;
        int result = Arrays.binarySearch(arr, key);
        System.out.println(result >= 0 ? "Found at index: " + result : "Not found");
    }
}


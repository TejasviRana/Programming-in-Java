package Part_3;

import java.util.Arrays;
public class MergeSort {
    /**
     * Merge two subarrays arr[left..mid] and arr[mid+1..right] of arr[]
     * @param arr the array to be sorted
     * @param left the start index of the first subarray
     * @param mid the end index of the first subarray
     * @param right the end index of the second subarray
     */
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    /**
     * Recursively divide an array into two halves until the base case is reached, then 
     * merge the halves in sorted order. This is a top-down approach to merge sort.
     * @param arr the array to be sorted
     * @param left the start index of the array
     * @param right the end index of the array
     */
    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    /**
     * The main method initializes an unsorted array and sorts it using the merge sort
     * algorithm. It then prints the sorted array to the console.
     * @param args command line arguments
     */

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}


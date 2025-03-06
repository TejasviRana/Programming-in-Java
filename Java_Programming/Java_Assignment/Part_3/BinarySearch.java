import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is at mid
            if (arr[mid] == target)
                return mid;
            
            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;
            
            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }
        return -1; // Target not found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking array input
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter sorted elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Taking target input
        System.out.print("Enter target element to search: ");
        int target = scanner.nextInt();
        
        // Searching for target element
        int result = binarySearch(arr, target);
        
        // Displaying the result
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
        
        scanner.close();
    }
}


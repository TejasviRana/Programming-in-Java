import java.util.*;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>(); // Maintain insertion order
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert set back to array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 8, 9, 7};
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}


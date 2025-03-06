package Part_3;

import java.util.*;
public class RemoveDuplicates {
    /**
     * Removes duplicates from an array and prints the result
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);
        System.out.println(set);
    }
}


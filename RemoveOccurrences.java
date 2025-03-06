package Part_3;

import java.util.*;
public class RemoveOccurrences {
    /**
     * Main method that removes all occurrences of a specified key from an integer array
     * and prints the resulting list.
     * 
     * @param args command line arguments, not used
     *            - Initializes an integer array with some values.
     *            - Specifies the key to be removed.
     *            - Iterates over the array and adds elements not equal to the key 
     *              to a list.
     *            - Prints the list containing elements after key removal.
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 1};
        int key = 1;
        List<Integer> list = new ArrayList<>();
        for (int x : arr) if (x != key) list.add(x);
        System.out.println(list);
    }
}


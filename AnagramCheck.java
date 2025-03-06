package Part_3;

import java.util.*;
public class AnagramCheck {
    /**
     * Checks if two strings are anagrams of each other.
     * @param args command line arguments, not used
     */
    public static void main(String[] args) {
        char[] s1 = "Silent".toLowerCase().toCharArray();
        char[] s2 = "Listen".toLowerCase().toCharArray();
        Arrays.sort(s1); Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2) ? "Anagram" : "Not Anagram");
    }
}

package Part_2;

public class SumArray {
    /**
     * This is the main method which makes use of the enhanced for loop
     * to iterate over the elements of the given array and sum them up.
     * It then prints the sum to the console.
     * @param args the command line arguments, which are not used in this program
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Sum: " + sum);
    }
}

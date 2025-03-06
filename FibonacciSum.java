public class FibonacciSum {
    /**
     * Computes the sum of the first n Fibonacci numbers and prints it.
     * The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding numbers, starting from 0 and 1.
     * @param args command line arguments, not used
     */
    public static void main(String[] args) {
        int n = 5, a = 0, b = 1, sum = 1; // 0 1 1 2 3
        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b; b = next;
        }
        System.out.println("Sum: " + sum);
    }
}

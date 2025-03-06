import java.util.Scanner;

public class FibonacciSum {
    // Method to calculate sum of Fibonacci series up to n terms
    public static int fibonacciSum(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        int a = 0, b = 1, sum = 1;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter number of terms: ");
        int num = scanner.nextInt();
        
        // Calculating sum of Fibonacci series
        int result = fibonacciSum(num);
        
        // Displaying result
        System.out.println("Sum of first " + num + " Fibonacci numbers is: " + result);
        
        scanner.close();
    }
}
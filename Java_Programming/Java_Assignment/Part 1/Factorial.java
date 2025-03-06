import java.util.Scanner;

public class Factorial {
    // Method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Calculating factorial
        long result = factorial(num);
        
        // Displaying result
        System.out.println("Factorial of " + num + " is: " + result);
        
        scanner.close();
    }
}


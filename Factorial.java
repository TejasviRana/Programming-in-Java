public class Factorial {
    /**
     * Prints the factorial of the given number to the console.
     * @param args the command line arguments, not used
     */
    public static void main(String[] args) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
}


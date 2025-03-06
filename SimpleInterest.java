public class SimpleInterest {
    /**
     * Calculates and prints the simple interest given principal, rate and time.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p = 1000, r = 5, t = 2; // p = principal, r = rate, t = time
        System.out.println("SI: " + (p * r * t / 100)); // SI = PRT / 100
    }
}

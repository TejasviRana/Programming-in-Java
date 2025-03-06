public class IntegerToBinary {
/**
 * Converts an integer to its binary representation and prints it.
 * Uses the Integer.toBinaryString method to perform the conversion.
 * @param args command line arguments, not used
 */

    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);
    }
}

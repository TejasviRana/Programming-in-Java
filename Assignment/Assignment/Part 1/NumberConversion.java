import java.util.Scanner;

public class NumberConversion {
    public static String intToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static int binaryToInt(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Convert integer to binary
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String binary = intToBinary(num);
        System.out.println("Binary representation: " + binary);
        
        // Convert binary to integer
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();
        int decimal = binaryToInt(binaryInput);
        System.out.println("Integer representation: " + decimal);
        
        scanner.close();
    }
}
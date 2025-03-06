import java.util.Scanner;

class ComplexNumber {
    double real, imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    // Display method
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);

        // Taking input for second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

        // Adding two complex numbers
        ComplexNumber result = ComplexNumber.add(c1, c2);

        // Displaying the result
        System.out.print("Sum of the complex numbers: ");
        result.display();

        scanner.close();
    }
}

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(35, 37);
        ComplexNumber num2 = new ComplexNumber(94, 90);
        
        ComplexNumber sum = num1.add(num2);
        
        System.out.println("Sum of complex numbers: " + sum);
    }
}

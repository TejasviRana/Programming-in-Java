class Complex {
    int real, img;
    Complex(int r, int i) { real = r; img = i; }
    /**
     * Adds a complex number to this complex number.
     * @param c the complex number to add
     */
    void add(Complex c) {
        real += c.real;
        img += c.img;
    }
    void display() { System.out.println(real + " + " + img + "i"); }
}
public class ComplexAddition {
    /**
     * Demonstrates the addition of two complex numbers using the Complex class.
     * The results are displayed on the console.
     * @param args the command line arguments, which are not used in this program
     */
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2), c2 = new Complex(1, 7);
        c1.add(c2); c1.display();
    }
}

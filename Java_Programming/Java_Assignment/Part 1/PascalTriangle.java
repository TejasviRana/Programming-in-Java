public class PascalTriangle {
    /**
     * Prints a Pascal's Triangle of height n. The triangle is right aligned and
     * centered horizontally. Each row is printed on a new line. The first and
     * last element of each row is 1.
     */
public static void main(String[] args) {
    int n = 5;
    for (int line = 1; line <= n; line++) {
        int c = 1;
        for (int j = 1; j <= n - line; j++) System.out.print(" ");
        for (int j = 1; j <= line; j++) {
            System.out.print(c + " ");
            c = c * (line - j) / j;
        }
        System.out.println();
    }
}
}
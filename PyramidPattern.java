public class PyramidPattern {
        /**
         * Prints a pyramid pattern of stars of height n. The pattern for n = 4 is
         *    *
         *   ***
         *  *****
         * *******
         * @param args command line arguments, not used
         */
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}

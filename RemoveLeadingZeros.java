package Part_3;

public class RemoveLeadingZeros {
    /**
     * The main method demonstrates removing leading zeros from a string.
     * It initializes a string with leading zeros and prints the result
     * after removing the leading zeros using regular expression.
     *
     * @param args command line arguments
     */

    public static void main(String[] args) {
        String str = "00000123569";
        System.out.println(str.replaceFirst("^0+", ""));
    }
}


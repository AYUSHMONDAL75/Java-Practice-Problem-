/*
 * Converts back and forth between binary and octal strings.
 * Goes through decimal in the middle since that's the easiest
 * way to do it without messing up grouping bits by 3.
 */
public class BinaryOctalConverter {

    public static String binaryToOctal(String binary) {
        int decimal = BinaryDecimalConverter.toDecimal(binary);
        return Integer.toOctalString(decimal);
    }

    public static String octalToBinary(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        return BinaryDecimalConverter.toBinary(decimal);
    }

    public static void main(String[] args) {
        String binary = "10110";
        String octal = binaryToOctal(binary);
        System.out.println("Binary " + binary + " to Octal = " + octal);
        System.out.println("Octal " + octal + " back to Binary = " + octalToBinary(octal));
    }
}

/*
 * Straightforward conversions between decimal, octal and hex.
 * Java already has built-in helpers for these, so no need to
 * reinvent the wheel here.
 */
public class DecimalOctalHexConverter {

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {
        int decimal = 250;
        String octal = decimalToOctal(decimal);
        String hex = decimalToHex(decimal);

        System.out.println("Decimal " + decimal + " to Octal = " + octal);
        System.out.println("Octal " + octal + " back to Decimal = " + octalToDecimal(octal));
        System.out.println("Decimal " + decimal + " to Hex = " + hex);
        System.out.println("Hex " + hex + " back to Decimal = " + hexToDecimal(hex));
    }
}

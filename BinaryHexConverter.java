/*
 * Converts back and forth between binary and hexadecimal strings.
 * Same idea as the octal converter - hop through decimal in the middle.
 */
public class BinaryHexConverter {

    public static String binaryToHex(String binary) {
        int decimal = BinaryDecimalConverter.toDecimal(binary);
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String hexToBinary(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return BinaryDecimalConverter.toBinary(decimal);
    }

    public static void main(String[] args) {
        String binary = "11010011";
        String hex = binaryToHex(binary);
        System.out.println("Binary " + binary + " to Hex = " + hex);
        System.out.println("Hex " + hex + " back to Binary = " + hexToBinary(hex));
    }
}

/*
 * Converts back and forth between binary strings and decimal ints.
 */
public class BinaryDecimalConverter {

    public static int toDecimal(String binary) {
        int value = 0;
        for (int i = 0; i < binary.length(); i++) {
            value = value * 2 + (binary.charAt(i) - '0');
        }
        return value;
    }

    public static String toBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            result.append(decimal % 2);
            decimal /= 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String binary = "10110";
        int decimal = toDecimal(binary);
        System.out.println("Binary " + binary + " to Decimal = " + decimal);
        System.out.println("Decimal " + decimal + " back to Binary = " + toBinary(decimal));
    }
}
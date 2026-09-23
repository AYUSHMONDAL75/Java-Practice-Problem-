/*
 * Subtracts one binary string from another. If the number being
 * subtracted is actually bigger, we swap them, do the subtraction,
 * and just stick a minus sign on the front of the answer.
 */
public class BinarySubtraction {

    public static String subtract(String a, String b) {
        boolean negative = false;

        if (BinaryDecimalConverter.toDecimal(a) < BinaryDecimalConverter.toDecimal(b)) {
            String temp = a;
            a = b;
            b = temp;
            negative = true;
        }

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int borrow = 0;

        while (i >= 0) {
            int bitA = a.charAt(i) - '0';
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int diff = bitA - bitB - borrow;
            if (diff < 0) {
                diff += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.append(diff);
            i--;
            j--;
        }

        // strip any leading zeros we picked up along the way
        String answer = result.reverse().toString().replaceFirst("^0+(?!$)", "");
        return negative ? "-" + answer : answer;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "0110";
        System.out.println(a + " - " + b + " = " + subtract(a, b));
    }
}

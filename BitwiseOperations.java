/*
 * AND, OR and XOR on two binary strings. If the strings are
 * different lengths, the shorter one gets padded with zeros
 * on the left first so the bits line up properly.
 */
public class BitwiseOperations {

    public static String and(String a, String b) {
        return apply(a, b, 'a');
    }

    public static String or(String a, String b) {
        return apply(a, b, 'o');
    }

    public static String xor(String a, String b) {
        return apply(a, b, 'x');
    }

    private static String apply(String a, String b, char op) {
        int len = Math.max(a.length(), b.length());
        a = padLeft(a, len);
        b = padLeft(b, len);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0';
            int bit;

            switch (op) {
                case 'a': bit = bitA & bitB; break;
                case 'o': bit = bitA | bitB; break;
                default:  bit = bitA ^ bitB; break;
            }

            result.append(bit);
        }

        return result.toString();
    }

    private static String padLeft(String s, int length) {
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "0110";
        System.out.println(a + " AND " + b + " = " + and(a, b));
        System.out.println(a + " OR  " + b + " = " + or(a, b));
        System.out.println(a + " XOR " + b + " = " + xor(a, b));
    }
}

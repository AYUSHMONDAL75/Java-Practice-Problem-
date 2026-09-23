public class BinaryMultiplication {
    public static String multiply(String a, String b) {
        String total = "0";
        int shift = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                String shifted = a + "0".repeat(shift);
                total = BinaryAddition.add(total, shifted);
            }
            shift++;
        }
        return total;
    }
    public static void main(String[] args) {
        String a = "101";
        String b = "011";
        System.out.println(a + " * " + b + " = " + multiply(a, b));
    }
}
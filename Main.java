import java.util.Scanner;

/*
 * Entry point that pulls everything together and asks the user
 * for two binary numbers, then runs them through all the other
 * classes in this folder.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two binary numbers (e.g. 1010):");
        System.out.print("First binary number : ");
        String bin1 = sc.next();
        System.out.print("Second binary number: ");
        String bin2 = sc.next();

        System.out.println();
        System.out.println("---- Binary Arithmetic ----");
        System.out.println(bin1 + " + " + bin2 + " = " + BinaryAddition.add(bin1, bin2));
        System.out.println(bin1 + " - " + bin2 + " = " + BinarySubtraction.subtract(bin1, bin2));
        System.out.println(bin1 + " * " + bin2 + " = " + BinaryMultiplication.multiply(bin1, bin2));

        System.out.println();
        System.out.println("---- Bitwise Operations ----");
        System.out.println(bin1 + " AND " + bin2 + " = " + BitwiseOperations.and(bin1, bin2));
        System.out.println(bin1 + " OR  " + bin2 + " = " + BitwiseOperations.or(bin1, bin2));
        System.out.println(bin1 + " XOR " + bin2 + " = " + BitwiseOperations.xor(bin1, bin2));

        System.out.println();
        System.out.println("---- Conversions for " + bin1 + " ----");
        int decimalValue = BinaryDecimalConverter.toDecimal(bin1);
        System.out.println("Binary to Decimal     : " + decimalValue);
        System.out.println("Binary to Octal       : " + BinaryOctalConverter.binaryToOctal(bin1));
        System.out.println("Binary to Hexadecimal : " + BinaryHexConverter.binaryToHex(bin1));

        System.out.println();
        System.out.println("---- Going back the other way from decimal " + decimalValue + " ----");
        System.out.println("Decimal to Binary : " + BinaryDecimalConverter.toBinary(decimalValue));
        System.out.println("Decimal to Octal  : " + DecimalOctalHexConverter.decimalToOctal(decimalValue));
        System.out.println("Decimal to Hex    : " + DecimalOctalHexConverter.decimalToHex(decimalValue));

        sc.close();
    }
}

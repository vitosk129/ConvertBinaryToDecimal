import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String args[]) {

        long binaryNumber, decimalNumber = 0, remainder, j = 1;
        System.out.print("Binary Number: ");

        Scanner scanner = new Scanner(System.in);
        binaryNumber = scanner.nextLong();

        while (binaryNumber != 0) {
            remainder = binaryNumber %10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " +decimalNumber);
    }
}

import java.util.Scanner;

// Write a Java program to convert an octal number to a hexadecimal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a n octal nimber: ");
        String octal = new Scanner(System.in).nextLine();

        int octalToDecimal = Integer.parseInt(octal, 8);
        String hexadecimal = Integer.toHexString(octalToDecimal);

        System.out.println(String.format("The hexadecimal number is %s", hexadecimal));
    }
}
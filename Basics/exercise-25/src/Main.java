import java.util.Scanner;

// Write a Java program to convert an octal number to a decimal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input an octal number: ");
        String octal = new Scanner(System.in).nextLine();

        int octalToDecimal =  Integer.parseInt(octal, 8);

        System.out.println(String.format("Decimal number is %d", octalToDecimal));
    }
}
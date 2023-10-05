import java.util.Scanner;

// Write a Java program to convert an octal number to a binary number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a n octal nimber: ");
        String octal = new Scanner(System.in).nextLine();

        int octalToDecimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(octalToDecimal);

        System.out.printf("The binary number is %s",binary);
    }
}
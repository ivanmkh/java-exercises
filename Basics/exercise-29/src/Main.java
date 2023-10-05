import java.util.Scanner;

// Write a Java program to convert a hexadecimal number into a binary number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = new Scanner(System.in).nextLine();
        int hexadecimalToDecimal = Integer.parseInt(hexadecimal, 16);
        String binary = Integer.toBinaryString(hexadecimalToDecimal);
        System.out.printf("binary number is %s", binary);
    }
}
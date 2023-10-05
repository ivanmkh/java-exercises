import java.util.Scanner;

// Write a Java program to convert a decimal number to a hexadecimal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a decimal number: ");
        int decimal = new Scanner(System.in).nextInt();

        String hexadecimal = Integer.toHexString(decimal);
        System.out.printf("Hexadecimal number is %s", hexadecimal.toUpperCase());
    }
}
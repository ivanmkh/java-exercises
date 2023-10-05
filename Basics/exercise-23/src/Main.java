import java.util.Scanner;

// Write a Java program to convert a binary number to a hexadecimal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a binary number: ");
        String binary = new Scanner(System.in).nextLine();

        int binaryToDecimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(binaryToDecimal);

        System.out.printf("Hexadecimal number is %s", hexadecimal.toUpperCase());
    }
}
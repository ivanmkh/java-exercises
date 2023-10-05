import java.util.Scanner;

// write a Java program to convert a decimal number to a binary one.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a decimal number: ");
        int decimal = new Scanner(System.in).nextInt();

        String binaryString = Integer.toBinaryString(decimal);
        System.out.printf("Binary number is %s", binaryString);
    }
}
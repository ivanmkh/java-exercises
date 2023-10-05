import java.util.Scanner;

// Write a Java program to convert a binary number to a decimal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a binary number: ");
        String binaryNumber = new Scanner(System.in).nextLine();
        int binaryToDecimal = Integer.parseInt(binaryNumber, 2);

        System.out.printf("The decimal number is %d", binaryToDecimal);
    }
}
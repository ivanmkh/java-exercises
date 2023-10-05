import java.util.Scanner;

// Write a Java program to convert a hexadecimal value into a decimal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = new Scanner(System.in).nextLine();
        int hexadecimalToDecimal = Integer.parseInt(hexadecimal, 16);
        System.out.printf("decimal number is %d", hexadecimalToDecimal);
    }
}
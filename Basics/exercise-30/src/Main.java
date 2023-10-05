import java.util.Scanner;

// Write a Java program to convert a hexadecimal value into an octal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = new Scanner(System.in).nextLine();
        int hexadecimalToDecimal = Integer.parseInt(hexadecimal, 16);
        String octal = Integer.toOctalString(hexadecimalToDecimal);
        System.out.printf("octal number is %s", octal);
    }
}
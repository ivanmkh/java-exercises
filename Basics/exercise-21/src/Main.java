import java.util.Scanner;

// Write a Java program to convert a decimal number to an octal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a decimal number: ");
        int decimal = new Scanner(System.in).nextInt();

        String octal = Integer.toOctalString(decimal);
        System.out.println(String.format("The octal number is %s", octal));
    }
}
import java.util.Scanner;

// Write a Java program to convert a binary number to an octal number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a binary number: ");
        String binary = new Scanner(System.in).nextLine();

        int binaryToDecimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(binaryToDecimal);

        System.out.println(String.format("The octal number is %s", octal));
    }
}
import java.util.Scanner;

// Write a Java program to multiply two binary numbers.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        int firstBinaryNumber = Integer.parseInt(String.valueOf(new Scanner(System.in).nextInt()),2);
        System.out.print("Input second binary number: ");
        int secondBinaryNumber = Integer.parseInt(String.valueOf(new Scanner(System.in).nextInt()),2);

        String product = Integer.toBinaryString(firstBinaryNumber * secondBinaryNumber);
        System.out.println(String.format("The product of two binary numbers is %s", product));
    }
}
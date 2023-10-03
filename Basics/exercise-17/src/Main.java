import java.util.Scanner;

// Write a Java program to add two binary numbers.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        int firstBinaryNumber = Integer.parseInt(new Scanner(System.in).nextLine(), 2);
        System.out.print("Input second binary number: ");
        int secondBinaryNumber = Integer.parseInt(new Scanner(System.in).nextLine(), 2);

        String result = Integer.toBinaryString(firstBinaryNumber + secondBinaryNumber);
        System.out.println(result);


    }
}
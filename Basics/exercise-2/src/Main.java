import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to print the sum of two numbers
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first number: ");
        int number1 = new Scanner(System.in).nextInt();

        System.out.print("Input a second number: ");
        int number2 = new Scanner(System.in).nextInt();

        int sum = number1 + number2;
        System.out.println(String.format("The sum is %d", sum));
    }
}
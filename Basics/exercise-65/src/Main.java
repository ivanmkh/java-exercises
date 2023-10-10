import java.util.Scanner;

// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input a second number: ");
        int number2 = new Scanner(System.in).nextInt();

        int divided = number1 / number2;
        int result = number1 - (divided * number2);

        System.out.printf("Result: %s", result);
    }
}
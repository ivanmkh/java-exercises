import java.util.Scanner;

// Write a Java program to divide two numbers and print the result on the screen.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input a second number: ");
        int number2 = new Scanner(System.in).nextInt();

        int result = number1 / number2;
        System.out.printf("The result is %d", result);
    }
}
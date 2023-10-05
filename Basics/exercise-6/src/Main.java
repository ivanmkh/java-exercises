import java.util.Scanner;

// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input a second number: ");
        int number2 = new Scanner(System.in).nextInt();

        int sum = number1 + number2;
        int multiply = number1 * number2;
        int substract = number1 - number2;
        int divide = number1 / number2;
        int reminder = number1 % number2;
        System.out.printf("%d + %d = %d", number1, number2, sum);
        System.out.printf("%d * %d = %d", number1, number2, multiply);
        System.out.printf("%d - %d = %d", number1, number2, substract);
        System.out.printf("%d / %d = %d", number1, number2, divide);
        System.out.printf("%d mod %d = %d", number1, number2, reminder);
    }
}
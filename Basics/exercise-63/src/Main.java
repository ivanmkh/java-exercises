import java.util.Scanner;

// Write a Java program that accepts two integer values from the user and returns the largest value.
// However, if the two values are the same, return 0 and find the smallest value if the two values
// have the same remainder when divided by 6.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input the second number: ");
        int number2 = new Scanner(System.in).nextInt();

        int result = 0;
        if (number1 == number2) {
            result = 0;
        } else if (number1 % 6 == number2 % 6) {
            result = number1 > number2 ? number2 : number1;
        } else {
            result = number1 > number2 ? number1 : number2;
        }

        System.out.printf("Result: %d", result);
    }
}
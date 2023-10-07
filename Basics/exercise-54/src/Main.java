import java.util.Scanner;

// Write a Java program that accepts three integers from the user and returns true
// if two or more of them (integers) have the same rightmost digit.
// The integers are non-negative.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input the second number: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.print("Input the third number : ");
        int number3 = new Scanner(System.in).nextInt();

        int rightmostDigit1 = number1 % 10;
        int rightmostDigit2 = number2 % 10;
        int rightmostDigit3 = number3 % 10;

        if (rightmostDigit1 == rightmostDigit2 ||
        rightmostDigit1 == rightmostDigit3 ||
        rightmostDigit2 == rightmostDigit3) {
            System.out.println(true);
        }
    }
}
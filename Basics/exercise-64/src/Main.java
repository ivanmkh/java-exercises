import java.util.Scanner;

// Write a Java program that accepts two integer values between 25 and 75
// and returns true if there is a common digit in both numbers.
public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;

        while (number1 <= 25 || number1 >= 75) {
            System.out.print("Input number1: ");
            number1 = new Scanner(System.in).nextInt();
        }
        while (number2 <= 25 || number2 >= 75) {
            System.out.print("Input number2: ");
            number2 = new Scanner(System.in).nextInt();
        }

        char[] digitsOfNumber1 = String.valueOf(number1).toCharArray();
        char[] digitsOfNumber2 = String.valueOf(number2).toCharArray();
        boolean result = false;

        for (char digit1 : digitsOfNumber1) {
            for (char digit2 : digitsOfNumber2) {
                if (digit1 == digit2) {
                    result = true;
                }
            }
        }

        System.out.println(result);
    }
}
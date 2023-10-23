import java.util.Scanner;

// Write a Java program to compute the number of trailing zeros in a factorial.
// 7! = 5040, therefore the output should be 1
public class Main {

    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();
        int factorial = factorial(number);
        System.out.println(factorial);
        System.out.println(trailingZeros(factorial));
    }

    public static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static int trailingZeros(int number) {
        int sum = 0;
        while (number % 10 == 0) {
            sum++;
            number /= 10;
        }
        return sum;
    }
}
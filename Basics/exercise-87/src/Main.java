import java.util.Scanner;

// write a Java program that then reads an integer and calculates the sum of
// its digits and writes the number of each digit of the sum in English.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();

        char[] digits = numberToCharArray(number);
        int sum = 0;
        for (char digit : digits) {
            sum += Integer.parseInt(String.valueOf(digit));
        }

        digits = numberToCharArray(sum);
        numbersToWords(digits);
    }

    public static char[] numberToCharArray(int number) {
        return String.valueOf(number).toCharArray();
    }

    public static void numbersToWords(char[] digits) {
        String[] digitDescription = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (char digit : digits) {
            System.out.print(digitDescription[Integer.parseInt(String.valueOf(digit))] + " ");
        }
    }
}
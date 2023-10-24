import java.util.Scanner;

// write a Java program to check if a positive number is a palindrome or not.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();
        char[] digits = String.valueOf(number).toCharArray();
        int middle = digits.length / 2 + digits.length % 2;

        boolean isPalindrome = true;
        for (int i = 0; i < middle; i++) {
            if (digits[i] != digits[digits.length - 1 -i]) {
                isPalindrome = false;
            }
        }

        String result = isPalindrome ? "" : "not";

        System.out.printf("This number is %s Palindrome.", result);
    }
}
import java.util.Scanner;

// Write a Java program and compute the sum of an integer's digits.
public class Main {
    public static void main(String[] args) {
        System.out.print("Inpu an integer number: ");
        int number = new Scanner(System.in).nextInt();

        int digitsSum = 0;
        String digits = String.valueOf(number);
        for (int i = 0; i < digits.length(); i++) {
            digitsSum += Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        System.out.printf("The sum of digits is %d", digitsSum);
    }
}
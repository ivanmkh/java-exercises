import java.util.Scanner;

// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input a second number: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.print("Input a third number: ");
        int number3 = new Scanner(System.in).nextInt();

        double average = (number1 + number2 + number3) / 3f;
        System.out.printf("The average of these numbers is %.2f", average);
    }
}
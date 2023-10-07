import java.util.Scanner;

// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input the second number: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.print("Input the third number : ");
        int number3 = new Scanner(System.in).nextInt();

        if (number1 + number2 == number3) {
            System.out.println(true);
        }
    }
}
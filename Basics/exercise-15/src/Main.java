import java.util.Scanner;

// Write a Java program to swap two variables.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input second number: ");
        int number2 = new Scanner(System.in).nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(String.format("The first number now is %d and the second is %d", number1, number2));
    }
}
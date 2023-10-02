import java.util.Scanner;

// Write a Java program that takes a number as input and prints its multiplication table up to 10.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d * %d = %d", number, i, number * i));
        }
    }
}
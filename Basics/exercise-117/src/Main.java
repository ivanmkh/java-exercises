import java.util.Scanner;

// Write a Java program to compute the square root of a given number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();

        double square = Math.sqrt(number);
        System.out.println(square);
    }
}
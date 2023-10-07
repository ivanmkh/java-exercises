import java.util.Scanner;

// Write a Java program to accept a number and check whether the
// number is even or not. Prints 1 if the number is even or 0 if odd.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();

        int result = number % 2 == 0 ? 1 : 0;
        System.out.println(result);
    }
}
import java.util.Scanner;

// Write a Java program to convert a string to an integer.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number(string): ");
        String stringNumber = new Scanner(System.in).nextLine();

        int number = Integer.parseInt(stringNumber);
        System.out.printf("The integer value is: %d", number);
    }
}
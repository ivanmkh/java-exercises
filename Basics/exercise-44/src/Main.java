import java.util.Scanner;

// Write a Java program that accepts a digit (n) and computes the value of n+nn+nnn.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a digit: ");
        String n = new Scanner(System.in).nextLine();

        if (n.matches("[0-9]{1}")) {
            int result = Integer.parseInt(n) + Integer.parseInt(n + n) +
                    Integer.parseInt(n + n + n);
            System.out.printf("n+nn+nnn = %d", result);
        } else {
            System.out.println("This is not a digit!");
        }
    }
}
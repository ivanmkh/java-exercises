import java.util.Scanner;

// Write a Java program starting with an integer n, divide it by 2 if it is even,
// or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }
        System.out.printf("number = %d" + System.lineSeparator(), number);
        System.out.println("Done");
    }
}
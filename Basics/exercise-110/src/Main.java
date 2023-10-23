import java.util.Scanner;

// Write a Java program to check whether the given integer is a power of 4 or not.
// Given num = 64, return true. Given num = 6, return false.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            while (number > 10) {
                number /= 4;
            }
            if (number == 4) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
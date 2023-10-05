import java.util.Scanner;

// Write a Java program to compare two numbers.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Input second number: ");
        int b = new Scanner(System.in).nextInt();

        if (a==b) {
            System.out.printf("%d = %d%n", a, b);
        }
        if (a!=b) {
            System.out.printf("%d != %d%n", a, b);
        }
        if (a>=b) {
            System.out.printf("%d >= %d%n", a, b);
        }
        if (a<=b) {
            System.out.printf("%d <= %d%n", a, b);
        }
        if (a>b) {
            System.out.printf("%d > %d%n", a, b);
        }
        if (a<b) {
            System.out.printf("%d < %d%n", a, b);
        }
    }
}
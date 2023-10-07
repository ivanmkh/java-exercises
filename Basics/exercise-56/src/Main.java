import java.util.Scanner;

// Write a Java program to find the number of values in a given range divisible by a given value.
// For example x = 5, y = 20 and p = 3, find the number of integers within the range x..y and that
// are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
public class Main {
    public static void main(String[] args) {
        System.out.print("Input x: ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Input y: ");
        int y = new Scanner(System.in).nextInt();
        System.out.print("Input p: ");
        int p = new Scanner(System.in).nextInt();

        int numberOfValues = 0;
        for (int i = x; i <= y; i++) {
            if (i % p == 0) numberOfValues++;
        }

        System.out.printf("The number of values: %d", numberOfValues);
    }
}
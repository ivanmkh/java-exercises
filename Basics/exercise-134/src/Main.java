import java.util.Scanner;

// Write a Java program to find distinct ways to climb to the top (n steps to reach the top) of stairs.
// Each time you climb, you can climb 1 or 2 steps.
// Example: n = 5
// a) 1+1+1+1+1 = 5
// b) 1+1+1+2 = 5
// c) 1+2+2 = 5
// d) 2+2+1 = 5
// e) 2+1+1+1 = 5
// f) 2+1+2 = 5
// g) 1+2+1+1 = 5
// h) 1+1+2+1 = 5
// Sample Output: Distinct ways can you climb to the top: 8
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number of steps: ");
        int n = new Scanner(System.in).nextInt();

        System.out.printf("Distinct ways can you climb to the top: %d", countWays(n));
    }

    public static int countWays(int n) {
        return fibonacci(n+1);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
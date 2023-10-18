import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to create an array of string values.
// The elements will contain "0", "1", "2" … through ... n-1.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input n: ");
        int n = new Scanner(System.in).nextInt();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }

        System.out.printf(Arrays.toString(array));
    }
}
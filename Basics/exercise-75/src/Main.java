import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to test if the first and last elements
// of an array of integers the same. The array length
// must be more than or equal to 2.
public class Main {
    public static void main(String[] args) {
        int length = 0;
        while (length < 2) {
            System.out.print("Input an array length: ");
            length = new Scanner(System.in).nextInt();
        }

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));

        if (array[0] == array[length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
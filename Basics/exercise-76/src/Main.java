import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to test if the first and last element of two integer
// arrays are the same. The array length must be greater than or equal to 2.
public class Main {
    public static void main(String[] args) {
        int length1 = 0;
        int length2 = 0;

        while (length1 < 2) {
            System.out.print("Input a first array length: ");
            length1 = new Scanner(System.in).nextInt();
        }
        while (length2 < 2) {
            System.out.print("Input a second array length: ");
            length2 = new Scanner(System.in).nextInt();
        }

        int[] array1 = new int[length1];
        int[] array2 = new int[length2];

        for (int i = 0; i < length1; i++) {
            array1[i] = (int) Math.round(Math.random() * 100);
        }

        for (int i = 0; i < length2; i++) {
            array2[i] = (int) Math.round(Math.random() * 100);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if (array1[0] == array2[length2 - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
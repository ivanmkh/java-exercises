import java.util.Arrays;
import java.util.Scanner;

//  Write a Java program to test if 10 appears as the first or last
//  element of an array of integers. The array length must be more
//  than or equal to 2.
public class Main {
    public static void main(String[] args) {
        int length = 0;
        while (length < 2) {
            System.out.print("Input an array length (>=2): ");
            length = new Scanner(System.in).nextInt();
        }

        int[] arrayOfNumbers = new int[length];

        for (int i = 0; i < length; i++) {
            arrayOfNumbers[i] = (int) Math.round(Math.random() * 100);
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

        if (arrayOfNumbers[0] == 10 || arrayOfNumbers[length - 1] == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
import java.util.Scanner;

// Write a Java program to count the number of even
// and odd elements in a given array of integers.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a length of an array: ");
        int arrayLength = new Scanner(System.in).nextInt();
        int evenCounter = 0;
        int oddCounter = 0;

        int[] array = new int[arrayLength];
        for (int element : array) {
            element = (int)Math.round(Math.random() * 1000);
            if (element % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.printf("even elements number: %s, odd elements number: %s", evenCounter, oddCounter);
    }
}
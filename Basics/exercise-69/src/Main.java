import java.util.Scanner;

// Write a Java program to extract the first half of an even string.
public class Main {
    public static void main(String[] args) {
        int originalStringLength = 0;
        String originalString = "";

        while (originalStringLength <= 0 || originalStringLength % 2 != 0) {
            System.out.print("Input a string: ");
            originalString = new Scanner(System.in).nextLine();
            originalStringLength = originalString.length();
        }

        String firstHalf = originalString.substring(0, originalStringLength / 2);
        System.out.printf("Output: %s", firstHalf);
    }
}
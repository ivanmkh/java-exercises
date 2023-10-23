import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

// Write a Java program that rotates a string by an offset (rotate from left to right).
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a string value: ");
        String text = new Scanner(System.in).nextLine();

        int offset = 2;
        char[] chars = text.toCharArray();

        for (int shift = 0; shift < offset; shift++) {
            char temp = chars[0];
            for (int i = 0; i < chars.length - 1; i++) {
                chars[i] = chars[i+1];
            }
            chars[chars.length - 1] = temp;
        }

        for (char ch : chars) {
            System.out.print(ch);
        }
    }
}
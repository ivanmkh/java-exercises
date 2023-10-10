import java.util.Scanner;

// Write a Java program to reverse a word.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a word: ");
        String word = new Scanner(System.in).nextLine();

        StringBuilder sb = new StringBuilder(word);
        word = sb.reverse().toString();

        System.out.printf("Reversev word: %s", word);
    }
}
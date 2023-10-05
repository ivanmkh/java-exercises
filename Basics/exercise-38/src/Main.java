import java.util.Scanner;

// Write a Java program to count letters, spaces, numbers and other characters in an input string.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a string: ");
        String text = new Scanner(System.in).nextLine();

        int letters = text.replaceAll("[^a-zA-Zа-яА-Я]", "").length();
        int spaces = text.replaceAll("[^ ]", "").length();
        int numbers = text.replaceAll("[^0-9]", "").length();
        int other = text.length() - letters - spaces - numbers;

        System.out.printf("letters: %d%n" +
                "spaces: %d%n" +
                "numbers: %d%n" +
                "other: %d%n", letters, spaces, numbers, other);
    }
}
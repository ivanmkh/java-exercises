import java.util.Scanner;

// Write a Java program to check if a string starts with a specified word.
public class Main {
    public static final String SPECIFIED_WORD = "Hello";

    public static void main(String[] args) {
        System.out.print("Input a string: ");
        String text = new Scanner(System.in).nextLine();
        String firstWord = text.split("[ ]+")[0];
        if (firstWord.toLowerCase().equals(SPECIFIED_WORD.toLowerCase())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
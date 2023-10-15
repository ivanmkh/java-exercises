import java.util.Scanner;

// Write a Java program to create a string taking the first three
// characters from a given string. If the string length is less
// than 3 use "#" as substitute characters.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a string: ");
        String userInput = new Scanner(System.in).nextLine();

        String result = String.format("%-3s", userInput)
                .replaceAll(" ", "#");
        result = result.length() > 3 ? result.substring(0, 3): result;

        System.out.printf("Result is: %s", result);
    }
}
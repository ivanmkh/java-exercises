import java.util.Scanner;

// Write a Java program to create a string taking the first and last
// characters from two given strings. If the length of each string is
// 0 use "#" for missing characters.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first string: ");
        String string1 = new Scanner(System.in).nextLine();
        System.out.print("Input a second string: ");
        String string2 = new Scanner(System.in).nextLine();

        char fisrtLetter = string1.isEmpty() ? '#' : string1.charAt(0);
        char secondLetter = string2.isEmpty() ? '#' : string2.charAt(0);

        StringBuilder sb = new StringBuilder();
        sb.append(fisrtLetter);
        sb.append(secondLetter);

        String result = sb.toString();
        System.out.printf("Result is: %s", result);

    }
}
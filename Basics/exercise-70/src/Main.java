import java.util.Scanner;

// Write a Java program to create a string in the form of
// short_string + long_string + short_string from two strings.
// The strings must not have the same length.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a first string: ");
        String string1 = new Scanner(System.in).nextLine();
        System.out.print("Input a first string: ");
        String string2 = new Scanner(System.in).nextLine();

        System.out.println(FormatStrings(string1, string2));
    }

    public static String FormatStrings(String string1, String string2) {
        int length1 = string1.length();
        int length2 = string2.length();
        if (length1 == length2) {
            return "";
        }
        String shortString = length1 > length2 ? string2 : string1;
        String longString = length1 > length2 ? string1 : string2;

        StringBuilder sb = new StringBuilder();
        sb.append(shortString).append(longString).append(shortString);

        return sb.toString();
    }
}
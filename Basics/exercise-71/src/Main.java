import java.util.Scanner;

// Write a Java program to create the concatenation of the two strings except removing
// the first character of each string. The length of the strings must be 1 and above.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input first string: ");
        String string1 = new Scanner(System.in).nextLine();
        System.out.print("Input second string: ");
        String string2 = new Scanner(System.in).nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(string1.substring(1));
        sb.append(string2.substring(1));

        String result = sb.toString();

        System.out.printf("Result string: %s", result);
    }
}
import java.util.Scanner;

//  Write a Java program to reverse a string.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input some text: ");
        String text = new Scanner(System.in).nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        System.out.println(reversed);
    }
}
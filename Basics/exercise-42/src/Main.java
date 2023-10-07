import java.io.Console;
import java.util.Scanner;

// Write a Java program to input and display your password.
public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.print("Input a password: ");
        char[] password = console.readPassword();

        System.out.println(password);
    }
}
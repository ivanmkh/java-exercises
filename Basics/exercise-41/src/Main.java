import java.util.Scanner;

// Write a Java program to print the ASCII value of a given character.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a character: ");
        char ch = new Scanner(System.in).nextLine().charAt(0);
        int charCode = (int) ch;
        System.out.printf("ASCII code is %d", charCode);
    }
}
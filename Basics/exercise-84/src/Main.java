import java.util.Scanner;

// Write a Java program to take the last three characters from a given string.
// It will add the three characters at both the front and back of the string.
// String length must be greater than three.
// Test data: "Python" will be "honPythonhon"
public class Main {
    public static final int MINIMAL_LENGTH = 3;
    public static void main(String[] args) {
        String text = "";
        int length = 0;
        while (length <= MINIMAL_LENGTH) {
            System.out.print("Input a string: ");
            text = new Scanner(System.in).nextLine();
            length = text.length();
        }
        String threeCharacters = text.substring(text.length() - MINIMAL_LENGTH);
        StringBuilder sb = new StringBuilder();
        sb.append(threeCharacters);
        sb.append(text);
        sb.append(threeCharacters);

        System.out.printf("Result: %s", sb.toString());
    }
}
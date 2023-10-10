import java.util.Scanner;

// Write a Java program to create another string of 4 copies of the last 3 characters
// of the original string. The original string length must be 3 and above.
public class Main {

    public static final int AMOUNT_OF_COPIED_CHARACTERS = 3;

    public static void main(String[] args) {
        int originalStringLength = 0;
        String originalString = "";
        while (originalStringLength <= AMOUNT_OF_COPIED_CHARACTERS) {
            System.out.print("Input a string: ");
            originalString = new Scanner(System.in).nextLine();
            originalStringLength = originalString.length();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < AMOUNT_OF_COPIED_CHARACTERS; i++) {
            sb.append(originalString.substring(originalString.length() - AMOUNT_OF_COPIED_CHARACTERS));
        }

        System.out.printf("Output: %s", sb);
    }
}
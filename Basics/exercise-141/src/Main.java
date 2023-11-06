import java.util.HashSet;
import java.util.Scanner;

// Write a Java program to check if a given string has all distinct characters.
// Sample Output:
// Original String : xyyz
// String has all unique characters: false
public class Main {
    public static void main(String[] args) {
        System.out.print("Original String : ");
        String text = new Scanner(System.in).nextLine();
        HashSet<Character> uniqChars = new HashSet<Character>();
        for (Character ch : text.toCharArray()){
            uniqChars.add(ch);
        }
        boolean allUnique = uniqChars.size() == text.toCharArray().length;

        System.out.printf("String has all unique characters: %b", allUnique);
    }
}
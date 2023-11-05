// Write a Java program to find the longest words in a dictionary.
public class Main {
    public static void main(String[] args) {
        String[] dictionary = {
                "cat",
                "dog",
                "red",
                "is",
                "am"
        };
        int maxLength = 0;
        for (int i = 0; i < dictionary.length; i++) {
            maxLength = Math.max(dictionary[i].length(), maxLength);
        }
        System.out.print("Longest words: ");
        for(String word : dictionary) {
            if (word.length() == maxLength) {
                System.out.printf("%s ", word);
            }
        }
    }
}
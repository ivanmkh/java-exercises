// Write a Java program to capitalize the first letter of each word in a sentence.
public class Main {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog.";
        String[] words = text.split("[ ]+");
        StringBuilder newText = new StringBuilder();
        for (String word : words) {
            newText.append(word.substring(0,1).toUpperCase() + word.substring(1) + " ");
        }
        System.out.println(newText  );
    }
}
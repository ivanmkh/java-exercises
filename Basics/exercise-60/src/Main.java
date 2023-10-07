// Write a Java program to find the penultimate (next to the last) word in a sentence.
public class Main {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String[] words = text.split("[ ]+");
        System.out.printf("the penultimate word in a sentence is: %s", words[words.length-2]);
    }
}
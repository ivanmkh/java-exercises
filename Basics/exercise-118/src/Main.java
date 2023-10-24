import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
public class Main {
    public static void main(String[] args) {
        String text = "Some text here.";
        String searchText = "text";

        System.out.println(text.indexOf(searchText));
    }
}
import java.nio.charset.Charset;

// Write a Java program to list the available character sets in charset objects.
public class Main {
    public static void main(String[] args) {
        for (String charset : Charset.availableCharsets().keySet()) {
            System.out.println(charset);
        }
    }
}
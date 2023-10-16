// Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.
public class Main {
    public static void main(String[] args) {
        System.out.printf("PATH: %s" + System.lineSeparator(), System.getenv("PATH"));
        System.out.printf("TEMP: %s" + System.lineSeparator(), System.getenv("TEMP"));
        System.out.printf("USERNAME: %s" + System.lineSeparator(), System.getenv("USERNAME"));
    }
}
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Pattern;

// Write a Java program to display the current date and time in a specific format.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss.SSS");
        LocalDateTime date = LocalDateTime.now();
        System.out.printf("Current date and time is %s", date.format(formatter));
    }
}
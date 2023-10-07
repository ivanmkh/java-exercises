import java.util.Scanner;

// Write a Java program to convert seconds to hours, minutes and seconds.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input seconds: ");
        int seconds = new Scanner(System.in).nextInt();

        int minutes = seconds / 60;
        seconds = seconds % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}
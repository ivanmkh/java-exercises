// Write a Java program to get the current system environment and system properties.
public class Main {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.printf("System environment: %s" + System.lineSeparator(), System.getenv());
        System.out.println("***************");
        System.out.printf("System properties: %s" + System.lineSeparator(),System.getProperties());
    }
}
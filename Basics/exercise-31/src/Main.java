// Write a Java program to check whether Java is installed on your computer.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Java Version: %s %n", System.getProperty("java.version"));
        System.out.printf("Java Runtime Version: %s %n", System.getProperty("java.vm.specification.version"));
        System.out.printf("Java Home: %s %n", System.getProperty("java.home"));
        System.out.printf("Java Vendor: %s %n", System.getProperty("java.vendor"));
        System.out.printf("Java Vendor URL: %s %n", System.getProperty("java.vendor.url"));
        System.out.printf("Java Class Path: %s %n", System.getProperty("java.class.path"));
    }
}
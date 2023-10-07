import java.io.File;

// Write a Java program to find the size of a specified file.
public class Main {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\Basics\\exercise-45\\exercise-45.iml";
        File file = new File(path);
        if (file.exists()) {
            System.out.printf("The size of a file is %d bytes.",file.length());
        } else {
            System.out.printf("There is no such file with a path = %s.", path);
        }

    }
}
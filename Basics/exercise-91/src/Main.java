// Write a Java program to measure how long code executes in nanoseconds.
public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String text = "";
        for (int i = 0; i < 1_000; i++) {
            text += i;
        }
        long endTime = System.nanoTime() - startTime;
        System.out.println(endTime);
    }
}
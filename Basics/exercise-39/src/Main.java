// Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4.
// Remark: unique here means that number with the same digit (e.g. 434) is not appropriate.
// Also count how many three-digit numbers are there.
public class Main {
    public static void main(String[] args) {
        String regex = "[1-4]{3}";
        int counter = 0;
        for (int i = 100; i < 1000; i++) {
            String numberToString = String.valueOf(i);
            if (numberToString.matches(regex) &&
                    numberToString.charAt(0) != numberToString.charAt(1) &&
                    numberToString.charAt(0) != numberToString.charAt(2) &&
                    numberToString.charAt(1) != numberToString.charAt(2)
            ) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.printf("Total number of unique three-digit numbers is %d", counter);
    }
}
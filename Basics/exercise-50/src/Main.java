//  Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
public class Main {
    public static void main(String[] args) {

        StringBuilder dividedBy3 = new StringBuilder();
        StringBuilder dividedBy5 = new StringBuilder();
        StringBuilder dividedBy3And5 = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                dividedBy3.append(i + " ");
            }
            if (i % 5 == 0) {
                dividedBy5.append(i + " ");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                dividedBy3And5.append(i + " ");
            }
        }

        System.out.printf("Divided by 3: %n %s %n", dividedBy3);
        System.out.printf("Divided by 5: %n %s %n", dividedBy5);
        System.out.printf("Divided by 3 and 5: %n %s %n", dividedBy3And5);
    }
}
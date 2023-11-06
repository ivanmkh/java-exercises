import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to merge the two sorted lists.
// Sample Output:
// Merge Two Sorted Lists:
// 1 2 3 7 9 13 40
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add((int) Math.round(Math.random() * 9));
            list2.add((int) Math.round(Math.random() * 9));
        }
        list1.addAll(list2);
        Collections.sort(list1);

        System.out.println(list1);

    }
}